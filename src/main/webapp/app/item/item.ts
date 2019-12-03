export default class ItemDetail {
  recipeId: string;
  recipeName: string;
  description: string;
  image: string;
  publishTime: string;
  userId: string;
  ingredient: Map<string, string>;
  practice: Map<string, string>;

  constructor(
    recipeId: string,
    recipeName: string,
    description: string,
    image: string,
    publishTime: string,
    userId: string,
    ingredient: Map<string, string>,
    practice: Map<string, string>
  ) {
    this.recipeId = recipeId;
    this.recipeName = recipeName;
    this.description = description;
    this.image = image;
    this.publishTime = publishTime;
    this.userId = userId;
    this.ingredient = ingredient;
    this.practice = practice;
  }
}
