import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import axios from 'axios';
import { Router } from '@angular/router';
@Component({
  selector: 'jhi-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
  private routeSub: Subscription;
  searchChunks;

  constructor(private router: ActivatedRoute, private router2: Router) {}

  async ngOnInit() {
    let searchKey;
    this.routeSub = this.router.params.subscribe(params => {
      searchKey = params['searchKey'];
    });

    try {
      const data = await axios.get('http://localhost:8080/recipe/search/' + searchKey);
      this.searchChunks = this.chunks(data.data, 4);
    } catch (e) {
      // TODO handle get data fail later
      //console.table(`Error connecting with server: ${e}`);
      // console.log('error');
    }
  }
  onSelect(searchRes) {
    this.router2.navigate(['/item', searchRes.recipeId]);
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
