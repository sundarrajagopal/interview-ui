import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders} from '@angular/common/http';
import { Observable} from 'rxjs/Observable';
import { withBody } from '@angular/core/testing';

const httpOptions = {

  headers: new HttpHeaders({ 'Content-Type': 'application/json' })

};

@Injectable()
export class InterviewService {

  constructor(private http:HttpClient) { }

  getCandidates(){
    return this.http.get('/server/interview/candidates');
  }

  getCandidate(id:number){
    return this.http.get('/server/interview/candidates/'+id)
  }

  createCandidateRegistration(candidate){
    let body = JSON.stringify(candidate);
    return this.http.post('/server/interview/savecandidate', body ,httpOptions);
  }

}
