import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Post } from './post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private url = "https://jsonplaceholder.typicode.com/posts"
  constructor(private httpClient: HttpClient) { }

  public getPostUsingObservable() : Observable<any> {
    return this.httpClient.get(this.url)
  }

}
