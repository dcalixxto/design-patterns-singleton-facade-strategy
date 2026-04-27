import { Cliente } from "./models/cliente.ts";
import { Facade } from "./facade/cliente-facade.ts";

const matheus = new Cliente(
  "Matheus Lima",
  "matheuslima",
  "231001-861@aluno.unipac.com",
);

Facade.ClienteFacade.removeConta(matheus);
