import { Component } from '@angular/core';
import { ApiService } from '../../api.service';
import {  City, Department, EmailResponse } from 'src/app/interfaces/api.interface';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Form } from '../../interfaces/api.interface';
import { emailcreation } from '../functions/emailFunctions';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  form: FormGroup;
  public cities: City[] = []
  public departments: Department[] = []
  public error: Department ={
    id: 999,
    nombre: 'error'
  }

  constructor(public fb: FormBuilder, public apiService: ApiService, private _snackBar: MatSnackBar) {
    this.form = this.fb.group({
      nombre: ['', [Validators.required, Validators.pattern(/^[a-zA-ZáéíóúüñÁÉÍÓÚÜÑ\s]+$/u)]],
      apellido: ['', [Validators.required,Validators.pattern(/^[a-zA-ZáéíóúüñÁÉÍÓÚÜÑ\s]+$/u)]],
      ciudad: ['', Validators.required],
      departamento: ['', Validators.required],
    });
  }

  ngOnInit() {
    this.apiService.getCities().subscribe(resp => {
      this.cities = resp
    })
  }

  triggerDepartamento() {
    this.apiService.getDepartments(this.form.get('ciudad')?.value?.id).subscribe(resp => {
      this.departments = resp;
    })
  }

  submitForm() {
    if (this.form.valid) {
      const email = emailcreation(this.form.get('nombre')?.value, this.form.get('apellido')?.value, this.form.get('ciudad')?.value.nombre, this.form.get('departamento')?.value.nombre)
      const requestData = {
        email: email,
        method: "REPLACE",
      }
      fetch('http://localhost:8080/api/email/process', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(requestData)
      })
      .then(response => response.json())
      .then(data => {
       // Handle backend response
        this.displayResult(data);
      })
      .catch(error => {
        console.error('Error al realizar la solicitud:', error);
      });
      console.log(email);
      this.form.reset();
    } else {
      console.log('Formulario inválido');
    }
  }

  displayResult(data:EmailResponse) {
    if(data.status === 'KO'){
      this._snackBar.open(data.status, data.message + ': ' + data.data.finalEmail );
      console.log(data);
    }else {
      this._snackBar.open(data.status, data.message);
      console.log(data);
    }

  }
}
