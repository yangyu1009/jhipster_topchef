import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs';
import axios from 'axios';
@Component({
  selector: 'jhi-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.scss']
})
export class ItemComponent implements OnInit {
  list;
  reviewList;

  private routeSub: Subscription;
  constructor(private router: ActivatedRoute) {}

  async ngOnInit() {
    let id;

    this.routeSub = this.router.params.subscribe(params => {
      // console.log(params) //log the entire params object
      // console.log(params['id']) //log the value of id
      id = params['id'];
    });
    try {
      this.list = await axios.get('http://localhost:8080/recipe/recipeDetail/' + id).then(function(response) {
        const detail = response.data;
        // console.log(response.data.title);

        return detail;
      });
    } catch (e) {
      // TODO handle get data fail later
      // console.table(`Error connecting with server: ${e}`);
    }
  }

  chunks = (array, size) => {
    if (array === undefined) {
      return array;
    }
    const results = [];
    while (array.length) {
      results.push(array.splice(0, size));
    }
    return results;
  };
}
