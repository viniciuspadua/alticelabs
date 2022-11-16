import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { AlticciOutput } from './model/AlticciOutput';
import { NumberOutput } from './model/NumberOutput';
import { Observable } from 'rxjs/internal/Observable';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  form = this.formBuilder.group({
    numero: ''
  });
  valor: Number = -1;
  list = new Array<NumberOutput>();

  constructor(private http: HttpClient, private formBuilder: FormBuilder, ) {
  }

  consultar() {
    var numero = this.form.value.numero
    if (numero != undefined && numero != "") {
      this.getNumber(numero).subscribe(response => {
        this.list = response.previous;
        this.valor = response.current.result;
      });
    }
  }

  getNumber(numero: any): Observable<AlticciOutput> {
    return this.http.get<AlticciOutput>('/alticci/' + numero);
  }

}
