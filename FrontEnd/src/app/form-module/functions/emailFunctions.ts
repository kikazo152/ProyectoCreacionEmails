export function emailcreation(nombre: string, apellido: string, ciudad: string, departamento: string) {
  const email = `${nombre[0]}${apellido.replace(/\s/g, '')}.${departamento.replace(/\s/g, '')}@${ciudad.replace(/\s/g, '')}.GoldenEye.com`.toLowerCase();
  return email;
}


