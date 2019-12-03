import { Component, OnInit } from '@angular/core';
import { RecipeInfo } from './model/recipeInfo';

@Component({
  selector: 'jhi-create-recipe',
  templateUrl: './create-recipe.component.html',
  styleUrls: ['./create-recipe.component.scss']
})
export class CreateRecipeComponent implements OnInit {
  number1 = 0;
  number2 = 0;
  myRecipeList: RecipeInfo[];

  constructor() {}

  ngOnInit() {}
  // var number = 0; //计数
  // add1(){
  //   var newchild = document.createElement("p");
  //   var group = 'ingredient'+this.number1+'：<input type="text" name="ingredientName['+this.number1+']"  id="ingredientName['+this.number1+']"/>&nbsp;&nbsp;weight'+this.number1+'：<input type="text" name="ingredientNumber['+this.number1+']" id="ingredientNumber['+this.number1+']"/><br/>';
  //   newchild.innerHTML = group;
  //   var groups = document.getElementById("groups1");
  //   groups.appendChild(newchild);
  //   this.number1++;
  // }
  // add2(){
  //   var newchild = document.createElement("p");
  //   var group = 'step'+this.number2+'：<input type="text" name="practiceDescription['+this.number2+']" id="practiceDescription['+this.number2+']"/><br/>';
  //   newchild.innerHTML = group;
  //   var groups = document.getElementById("groups2");
  //   groups.appendChild(newchild);
  //   this.number2++;
  // }
}
