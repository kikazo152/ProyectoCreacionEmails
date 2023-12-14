
// INTERFACES 

// INTERFACE FOR THE CITY

export interface City {
  id: number,
  nombre: string,
}

// INTERFACE FOR THE DEPARTMENT

export interface Department {
  id: number,
  nombre: string
}

// INTERFACE FOR EMAIL RESPONSE 

export interface EmailResponse {
  status: string;
  message: string;
  data: {
    result: string;
    finalEmail: string;
  
  };
}

// INTERFACE FOR THE FORM 

export interface Form {
  nombre: string;
  apellido: string;
  ciudad: { nombre: string };
  departamento: { nombre: string };
}

// DATA INTERFACE 

export interface RequestData {
  email: string;
  method: string;
}
