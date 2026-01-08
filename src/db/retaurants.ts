export interface Restaurant {
  restaurantId: number;
  restaurantName: string;
  rating: number;
  menuTypes: string[];
  imageUrl: string;
  location: string;
}

export const RESTAURANTS: Restaurant[] = [
  {
    restaurantId: 1,
    restaurantName: "Paradise Biryani",
    rating: 4.6,
    menuTypes: ["Hyderabadi Biryani", "Kebabs", "Mughlai", "Desserts", "Beverages"],
    imageUrl: "https://images.unsplash.com/photo-1631515243349-e0cb75fb8b43?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Secunderabad",
  },
  {
    restaurantId: 2,
    restaurantName: "Bawarchi",
    rating: 4.5,
    menuTypes: ["Biryani", "Curries", "Chinese", "Tandoori", "Soups"],
    imageUrl: "https://images.unsplash.com/photo-1599487488170-d11ec9c172f0?auto=format&fit=crop&q=80&w=800&h=450",
    location: "RTC Cross Road",
  },
  {
    restaurantId: 3,
    restaurantName: "Barbeque Nation",
    rating: 4.6,
    menuTypes: ["Live Grill", "Starters", "Buffet", "Desserts", "Mocktails"],
    imageUrl: "https://images.unsplash.com/photo-1544025162-d76694265947?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Jubilee Hills",
  },
  {
    restaurantId: 4,
    restaurantName: "Chutneys",
    rating: 4.7,
    menuTypes: ["South Indian", "Breakfast", "Tiffins", "Beverages", "Desserts"],
    imageUrl: "https://images.unsplash.com/photo-1589308078055-918f7f7d17a9?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Banjara Hills",
  },
  {
    restaurantId: 5,
    restaurantName: "Mehfil",
    rating: 4.3,
    menuTypes: ["Biryani", "Tandoori", "North Indian", "Mughlai", "Fast Food"],
    imageUrl: "https://images.unsplash.com/photo-1626777552726-4a6b54c97e46?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Nampally",
  },
  {
    restaurantId: 6,
    restaurantName: "Pista House",
    rating: 4.4,
    menuTypes: ["Haleem", "Biryani", "Kebabs", "Bakery", "Sweets"],
    imageUrl: "https://images.unsplash.com/photo-1601050690597-df0568f70950?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Abids",
  },
  {
    restaurantId: 7,
    restaurantName: "Hotel Shadab",
    rating: 4.5,
    menuTypes: ["Mughlai", "Biryani", "Kebabs", "Curries", "Desserts"],
    imageUrl: "https://images.unsplash.com/photo-1592861956120-e524fc739696?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Ghansi Bazaar",
  },
  {
    restaurantId: 8,
    restaurantName: "Ulavacharu",
    rating: 4.4,
    menuTypes: ["Andhra Meals", "Seafood", "Veg & Non-Veg", "Rice Bowls", "Desserts"],
    imageUrl: "https://images.unsplash.com/photo-1600891964599-f61ba0e24092?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Madhapur",
  },
  {
    restaurantId: 9,
    restaurantName: "Santosh Dhaba",
    rating: 4.1,
    menuTypes: ["North Indian", "Punjabi", "Veg Meals", "Thalis", "Chinese"],
    imageUrl: "https://images.unsplash.com/photo-1589302168068-964664d93dc0?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Koti",
  },
  {
    restaurantId: 10,
    restaurantName: "Cafe Niloufer",
    rating: 4.8,
    menuTypes: ["Irani Tea", "Bakery", "Snacks", "Breakfast", "Beverages"],
    imageUrl: "https://images.unsplash.com/photo-1509042239860-f550ce710b93?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Red Hills",
  },
  {
    restaurantId: 11,
    restaurantName: "Cream Stone",
    rating: 4.3,
    menuTypes: ["Ice Cream", "Desserts", "Waffles", "Shakes", "Cakes"],
    imageUrl: "https://images.unsplash.com/photo-1560008581-09826d1de69e?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Gachibowli",
  },
  {
    restaurantId: 12,
    restaurantName: "Flechazo",
    rating: 4.6,
    menuTypes: ["Buffet", "Live Grill", "Continental", "Desserts", "Mocktails"],
    imageUrl: "https://images.unsplash.com/photo-1550547660-d9450f859349?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Hitech City",
  },
  {
    restaurantId: 13,
    restaurantName: "The Belgian Waffle Co.",
    rating: 4.5,
    menuTypes: ["Waffles", "Pancakes", "Desserts", "Beverages", "Snacks"],
    imageUrl: "https://images.unsplash.com/photo-1578985545062-69928b1d9587?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Kondapur",
  },
  {
    restaurantId: 14,
    restaurantName: "Domino's Pizza",
    rating: 4.0,
    menuTypes: ["Pizza", "Garlic Bread", "Pasta", "Desserts", "Beverages"],
    imageUrl: "https://images.unsplash.com/photo-1594007654729-407eedc4be65?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Ameerpet",
  },
  {
    restaurantId: 15,
    restaurantName: "Subway",
    rating: 4.1,
    menuTypes: ["Subs", "Salads", "Wraps", "Healthy Bowls", "Beverages"],
    imageUrl: "https://images.unsplash.com/photo-1550317138-10000687a72b?auto=format&fit=crop&q=80&w=800&h=450",
    location: "Begumpet",
  },
];
