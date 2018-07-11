import { Component, OnInit } from '@angular/core';
import { InterviewService} from '../../services/interview.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  technicalStack: string[] = ['Java',
  '.NET',
  'Oracle'];

  candidateForm :FormGroup
  validMessage : string ="";


  constructor(private interviewService : InterviewService) { }

  ngOnInit() {
    this.candidateForm = new FormGroup({

      recruiterName: new FormControl('', Validators.required),
      candidateName: new FormControl('', Validators.required),
      phoneNumber: new FormControl('', Validators.required),
      emailAddress: new FormControl('', Validators.required),
      skypeId: new FormControl('', Validators.required),
      technicalStack: new FormControl('', Validators.required),
      interviewer: new FormControl('', Validators.required),
      interviewScheduleDate : new FormControl('', Validators.required),
      yearsOfExperience: new FormControl('', Validators.required)
    });
  }

  submitRegistration() {

    if (this.candidateForm.valid) {

      this.validMessage = "Your Candidate registration has been submitted. Thank you!";
      this.interviewService.createCandidateRegistration(this.candidateForm.value).subscribe(
        data => {
          this.candidateForm.reset();
          return true;
        },
        error => {
          return Observable.throw(error);
        }
      )
    } else {
      this.validMessage = "Please fill out the form before submitting!";
    }

  }


}
