import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const baseURL = 'http://localhost:8085/api/tutorials'


@Injectable({
  providedIn: 'root'
})
export class CommentService {

  constructor(private httpClient: HttpClient) { }

  getAllCommentsForTutorial(tutorialId: any): Observable<Comment[]>{
    return this.httpClient.get<Comment[]>(`${baseURL}/${tutorialId}/comments`)
  }

  getComment(id: any):  Observable<Comment[]>{
    return this.httpClient.get<Comment[]>(`${baseURL}/comments/${id}`)
  }

  deleteComment(id: any):  Observable<Comment[]>{
    return this.httpClient.delete<Comment[]>(`${baseURL}/comments/${id}`)
  }

  createCommetn(id: any, data: any):  Observable<Comment[]>{
    return this.httpClient.post<Comment[]>(`${baseURL}/comments/${id}`, data)
  }

  deleteCommentOfTutorial(tutorialId: any):  Observable<Comment[]>{
    return this.httpClient.delete<Comment[]>(`${baseURL}/tutorials/${tutorialId}/comments`)
  }

}
