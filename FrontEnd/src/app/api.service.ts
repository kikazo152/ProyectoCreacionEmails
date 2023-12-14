import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { City, Department, Form, RequestData } from './interfaces/api.interface';
import { Observable } from 'rxjs';
import { emailcreation } from './form-module/functions/emailFunctions';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';



@Injectable({
  providedIn: 'root'
})
export class ApiService {

  // COMMON START OF APIS

  private baseUrl:string = 'http://localhost:8080/api/'

  constructor(private http: HttpClient, private fb: FormBuilder) { }

  // CITIES API

  getCities():Observable<City[]>{

  return this.http.get<City[]>(this.baseUrl + 'ciudades');
  }

  // DEPARTMENT API

  getDepartments(id:number):Observable<Department[]>{

    return this.http.get<Department[]>(this.baseUrl + id + '/departamentos');
  }

  }





