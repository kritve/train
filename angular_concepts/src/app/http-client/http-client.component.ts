import { Component } from '@angular/core';
import { PostService } from '../post.service';
import { Post } from '../post';
import { from } from 'rxjs';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-http-client',
  imports: [CommonModule],
  templateUrl: './http-client.component.html',
  styleUrl: './http-client.component.css'
})
export class HttpClientComponent {
  posts = new Array<Post>

  constructor(private service: PostService) {}

  ngOnInit() {
    this.service.getPostUsingObservable().subscribe( response => {
      this.posts = response.map( item => {
        return new Post(
          item.body,
          item.id,
          item.title,
          item.userId
        )
      })
    })


    const data = from(fetch('https://jsonplaceholder.typicode.com/posts'))
    data.subscribe({
      next(response){ console.log(response)},
      error(err) {console.log('Error - ' + err)},
      complete() {
        console.log('Completed')
      },
    })

  }
}
