package com.example.demoapi.models

import kotlinx.serialization.Serializable

@Serializable
data class FoodCategory(
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val foods: List<Food>? = null
)

@Serializable
data class Food(
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val image: String? = null,
    val price: String? = null,
    val starReview: Int = 1
)


val products = listOf(
    FoodCategory(
        id = 1,
        name = "Burgers",
        description = "Savor the symphony of flavors in our gourmet burgers, where premium ingredients and artisanal craftsmanship unite to redefine your burger experience.",
        foods = listOf(
            Food(
                id = 101,
                name = "Cheesy Haven Deluxe",
                description = "Immerse yourself in the ultimate cheesy delight atop a juicy patty.",
                image = "file:///android_asset/images/burger/CheesyHavenDeluxe.png",
                price = "340.00",
                starReview = 5
            ),
            Food(
                id = 102,
                name = "Garden Gastronomy Burger",
                description = "Delight in a vegetarian masterpiece with a fresh garden vegetable patty.",
                image = "file:///android_asset/images/burger/GardenGastronomyBurger.png",
                price = "360.00",
                starReview = 5
            ),
            Food(
                id = 103,
                name = "Maple Bacon Marvel Burger",
                description = "Experience a harmonious blend of sweet maple syrup and crispy bacon.",
                image = "file:///android_asset/images/burger/MapleBaconMarvelBurger.png",
                price = "340.00",
                starReview = 3
            ),
            Food(
                id = 104,
                name = "Mediterranean Mingle Burger",
                description = "Transport your taste buds with an herb-infused patty and regional toppings.",
                image = "file:///android_asset/images/burger/MediterraneanMingleBurger.png",
                price = "290.00",
                starReview = 3
            ),
            Food(
                id = 105,
                name = "Smoking Summit Burger",
                description = "Enjoy a smoky twist with doubled meaty char-grilled patty topped.",
                image = "file:///android_asset/images/burger/SmokinSummitBurger.png",
                price = "490.00",
                starReview = 5
            ),
            Food(
                id = 106,
                name = "Southwest Sizzle Supreme",
                description = "Take a journey to the Southwest with a sizzling, spice-infused burger.",
                image = "file:///android_asset/images/burger/SouthwestSizzleSupreme.png",
                price = "290.00",
                starReview = 3
            ),
            Food(
                id = 107,
                name = "Spicy Bacon Fusion Fiesta Burger",
                description = "Embark on a fiery adventure with a boldly spiced patty and exciting toppings.",
                image = "file:///android_asset/images/burger/SpicyBaconFusionFiestaBurger.png",
                price = "320.00",
                starReview = 5
            ),
            Food(
                id = 108,
                name = "Zesty Zing Burger",
                description = "Experience a punch of zesty and tangy flavors in every bite.",
                image = "file:///android_asset/images/burger/ZestyZingBurger.png",
                price = "280.00",
                starReview = 5
            )
        )
    ),
    FoodCategory(
        id = 2,
        name = "Pizza",
        description = "Elevate your pizza cravings with our handcrafted masterpieces, featuring a perfect marriage of crispy crusts, premium toppings, and mouthwatering sauces that transport you to the heart of pizzerias in Italy.",
        foods = listOf(
            Food(
                id = 201,
                name = "Tropical Cheese Paradise Hawaiian Pizza",
                description = "Experience the best of both worlds with a Hawaiian twist—ham, pineapple, and a duo of cheeses for a delightful tropical and cheesy fusion.",
                image = "file:///android_asset/images/pizza/TropicalHawaiianPizza.png",
                price = "490.00",
                starReview = 4
            ),
            Food(
                id = 202,
                name = "Four-Cheese Fiesta Pizza",
                description = "Dive into a flavor celebration with a blend of four cheeses, creating a rich and savory symphony on your favorite pizza dough.",
                image = "file:///android_asset/images/pizza/Four-CheeseFiestaPizza.png",
                price = "550.00",
                starReview = 5
            ),
            Food(
                id = 203,
                name = "Double Cheese Delight Pizza",
                description = "A cheesy sensation featuring two types of melted cheeses over a classic crust for an indulgent and gooey experience.",
                image = "file:///android_asset/images/pizza/DoubleCheeseDelightPizza.png",
                price = "530.00",
                starReview = 5
            )
        )
    ),
    FoodCategory(
        id = 3,
        name = "Pasta",
        description = "Indulge in the artistry of Italian cuisine with our exquisite pasta dishes, where every strand is a masterpiece of texture and taste, bringing the essence of Italy to your table.",
        foods = listOf(
            Food(
                id = 301,
                name = "Filipino Spaghetti",
                description = "Distinguished by its unique sauce made with banana ketchup and brown sugar.",
                image = "file:///android_asset/images/pasta/FilipinoSpaghetti.png",
                price = "170.00",
                starReview = 4
            ),
            Food(
                id = 302,
                name = "Sicilian Sausage Sensation Pasta",
                description = "Delight in the bold flavors of Sicilian sausage, roasted peppers, and a hearty Bolognese sauce, creating a sensational pasta experience.",
                image = "file:///android_asset/images/pasta/SicilianSausageSensationPasta.png",
                price = "210.00",
                starReview = 3
            ),
            Food(
                id = 303,
                name = "Truffle Tango Bolognese Linguine",
                description = "Engage your taste buds in a dance of flavors with a Bolognese sauce enriched with truffle essence, elegantly twirled with linguine for a luxurious and indulgent tango.",
                image = "file:///android_asset/images/pasta/TruffleTangoBologneseLinguine.png",
                price = "220.00",
                starReview = 4
            ),
            Food(
                id = 304,
                name = "Rosy Tomato Burst Macaroni",
                description = "Indulge in the vibrant flavors of a tomato-rich sauce coating every macaroni, creating a rosy burst of deliciousness in every bite.",
                image = "file:///android_asset/images/pasta/RosyTomatoBurstMacaroni.png",
                price = "220.00",
                starReview = 4
            ),
            Food(
                id = 305,
                name = "Hearty Herb-Infused Bolognese Harmony",
                description = "Savor the rich and savory blend of slow-cooked Bolognese sauce, infused with a medley of aromatic herbs, perfectly paired with al dente pasta for flavorful harmony.",
                image = "file:///android_asset/images/pasta/HeartyHerbBolognese.png",
                price = "260.00",
                starReview = 4
            )
        )
    ),
    FoodCategory(
        id = 4,
        name = "Wings",
        description = "Experience a burst of flavors with our wings collection, where each bite is a journey through zesty marinades, unique spice blends, and the perfect balance of crispy and tender textures.",
        foods = listOf(
            Food(
                id = 401,
                name = "Taco Wings",
                description = "Indulge in the vibrant fusion of flavors with our Taco wings.",
                image = "file:///android_asset/images/wings/Taco.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 402,
                name = "Sweet And Spicy Wings",
                description = "Experience the perfect balance of sweetness and heat in our Sweet And Spicy wings.",
                image = "file:///android_asset/images/wings/SweetAndSpicy.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 403,
                name = "Spicy Honey Wings",
                description = "Savor the unique blend of spices with our Spicy Honey wings, each crafted to elevate your culinary experience.",
                image = "file:///android_asset/images/wings/SpicyHoney.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 404,
                name = "Salted Egg Wings",
                description = "Embark on a savory journey with our Salted Egg wings.",
                image = "file:///android_asset/images/wings/SaltedEgg.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 405,
                name = "Lemon Pepper Wings",
                description = "Embrace the citrusy zest of our Lemon Pepper wings.",
                image = "file:///android_asset/images/wings/LemonPepper.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 406,
                name = "Korean Snowing Cheese Wings",
                description = "Enjoy the creamy goodness of Korean Snowing Cheese wings.",
                image = "file:///android_asset/images/wings/KoreanSnowingCheese.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 407,
                name = "Honey Garlic Wings",
                description = "Delight in the savory-sweet harmony of our Honey Garlic wings.",
                image = "file:///android_asset/images/wings/HoneyGarlic.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 408,
                name = "Honey Chipotle Wings",
                description = "Experience the smoky and sweet heat of our Honey Chipotle wings.",
                image = "file:///android_asset/images/wings/HoneyChipotle.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 409,
                name = "Garlic Parmesan Wings",
                description = "Savor the rich and cheesy goodness of our Garlic Parmesan wings.",
                image = "file:///android_asset/images/wings/GarlicParmesan.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 410,
                name = "Buffalo Extra Hot Wings",
                description = "Dare to conquer the intense heat of Buffalo Extra Hot wings.",
                image = "file:///android_asset/images/wings/BuffaloExtra-Hot.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 411,
                name = "Buffalo Wings",
                description = "Relish the classic spiciness of our Buffalo wings.",
                image = "file:///android_asset/images/wings/Buffalo.png",
                price = "290.00",
                starReview = 4
            ),
            Food(
                id = 412,
                name = "BBQ Wings",
                description = "Savor the smoky richness of our BBQ wings, ensuring an unforgettable feast for your senses.",
                image = "file:///android_asset/images/wings/BBQ.png",
                price = "290.00",
                starReview = 4
            ),
        )
    ),
    FoodCategory(
        id = 5,
        name = "Salad",
        description = "Revitalize your senses with our vibrant salad creations, where freshness meets innovation, and each bite is a celebration of colors, textures, and wholesome goodness.",
        foods = listOf(
            Food(
                id = 501,
                name = "Garden Salad",
                description = "Immerse yourself in the freshness of our Garden Salad, a colorful symphony of crisp greens, vibrant vegetables, and a medley of flavors that promise a refreshing and nutritious escape in every bite.",
                image = "file:///android_asset/images/salad/GardenSalad.png",
                price = "390.00",
                starReview = 4
            ),
            Food(
                id = 502,
                name = "Garden Salad Grilled Chicken Breast",
                description = "Savor the healthful abundance of our Garden Salad with Grilled Chicken Breast, where an array of fresh, crisp vegetables meets the succulent goodness of grilled chicken, creating a wholesome and satisfying salad experience.",
                image = "file:///android_asset/images/salad/GardenSaladGrilledChickenBreast.png",
                price = "420.00",
                starReview = 4
            ),
            Food(
                id = 503,
                name = "Grilled Steak Salad Dressing",
                description = "Elevate your salad game with our Grilled Steak Salad Dressing, featuring tender slices of grilled steak atop a bed of fresh greens, drizzled with a delectable dressing that perfectly complements the robust flavors of the steak.",
                image = "file:///android_asset/images/salad/GrilledSteakSaladDressing.png",
                price = "450.00",
                starReview = 4
            ),
            Food(
                id = 504,
                name = "House Caesar Salad",
                description = "Indulge in the classic sophistication of our House Caesar Salad, where crisp romaine lettuce is tossed with Parmesan cheese, croutons, and our signature Caesar dressing, delivering a timeless and satisfying salad experience.",
                image = "file:///android_asset/images/salad/HouseCaesarSalad.png",
                price = "490.00",
                starReview = 4
            ),
            Food(
                id = 505,
                name = "Kani Mango Salad",
                description = "Embark on a journey of vibrant flavors with our Kani Mango Salad, where succulent crab sticks meet the sweet allure of ripe mango, creating a refreshing and delightful medley that captures the essence of tropical indulgence.",
                image = "file:///android_asset/images/salad/KaniMangoSalad.png",
                price = "390.00",
                starReview = 4
            )
        )
    ),
    FoodCategory(
        id = 5,
        name = "Salad",
        description = "Revitalize your senses with our vibrant salad creations, where freshness meets innovation, and each bite is a celebration of colors, textures, and wholesome goodness.",
        foods = listOf(
            Food(
                id = 501,
                name = "Garden Salad",
                description = "Immerse yourself in the freshness of our Garden Salad, a colorful symphony of crisp greens, vibrant vegetables, and a medley of flavors that promise a refreshing and nutritious escape in every bite.",
                image = "file:///android_asset/images/salad/GardenSalad.png",
                price = "390.00",
                starReview = 4
            ),
            Food(
                id = 502,
                name = "Garden Salad Grilled Chicken Breast",
                description = "Savor the healthful abundance of our Garden Salad with Grilled Chicken Breast, where an array of fresh, crisp vegetables meets the succulent goodness of grilled chicken, creating a wholesome and satisfying salad experience.",
                image = "file:///android_asset/images/salad/GardenSaladGrilledChickenBreast.png",
                price = "420.00",
                starReview = 4
            ),
            Food(
                id = 503,
                name = "Grilled Steak Salad Dressing",
                description = "Elevate your salad game with our Grilled Steak Salad Dressing, featuring tender slices of grilled steak atop a bed of fresh greens, drizzled with a delectable dressing that perfectly complements the robust flavors of the steak.",
                image = "file:///android_asset/images/salad/GrilledSteakSaladDressing.png",
                price = "450.00",
                starReview = 4
            ),
            Food(
                id = 504,
                name = "House Caesar Salad",
                description = "Indulge in the classic sophistication of our House Caesar Salad, where crisp romaine lettuce is tossed with Parmesan cheese, croutons, and our signature Caesar dressing, delivering a timeless and satisfying salad experience.",
                image = "file:///android_asset/images/salad/HouseCaesarSalad.png",
                price = "490.00",
                starReview = 4
            ),
            Food(
                id = 505,
                name = "Kani Mango Salad",
                description = "Embark on a journey of vibrant flavors with our Kani Mango Salad, where succulent crab sticks meet the sweet allure of ripe mango, creating a refreshing and delightful medley that captures the essence of tropical indulgence.",
                image = "file:///android_asset/images/salad/KaniMangoSalad.png",
                price = "390.00",
                starReview = 4
            )
        )
    ),

    FoodCategory(
        id = 6,
        name = "Steaks",
        description = "Unleash your carnivorous cravings with our perfectly grilled steaks, where prime cuts meet expert seasoning, delivering a steakhouse experience that's nothing short of exceptional.",
        foods = listOf(
            Food(
                id = 601,
                name = "Flat Iron Steak",
                description = "Experience the culinary finesse of our Flat Iron Steak, where a meticulously selected cut is grilled to perfection, offering a delightful tenderness and robust flavor that is both satisfying and unforgettable.",
                image = "file:///android_asset/images/steak/FlatIronSteak.png",
                price = "495.00",
                starReview = 4
            ),
            Food(
                id = 602,
                name = "Porter Steak House",
                description = "Step into a realm of steakhouse elegance with our Porter Steak House creation, featuring a perfectly grilled porterhouse cut, charred to perfection, and exuding a symphony of savory notes that elevate the steakhouse experience.",
                image = "file:///android_asset/images/steak/PorterSteakHouse.png",
                price = "465.00",
                starReview = 4
            ),
            Food(
                id = 603,
                name = "T-Bone Steak",
                description = "Savor the epitome of steak excellence with our T-Bone Steak, a culinary masterpiece where the rich flavors of tenderloin and strip loin converge, creating a steak experience that is both bold and succulent.",
                image = "file:///android_asset/images/steak/TBoneSteak.png",
                price = "435.00",
                starReview = 4
            )
        )
    ),
    FoodCategory(
        id = 7,
        name = "Fries",
        description = "Delight in the golden perfection of our fries, expertly crafted to crispy perfection, inviting you to experience the ultimate sidekick to your favorite meals.",
        foods = listOf(
            Food(
                id = 701,
                name = "Cheese Fries with MeatChunks",
                description = "Indulge in the ultimate comfort food with our Cheese Fries adorned with savory meat chunks, where each fry is smothered in a layer of gooey melted cheese and topped with succulent meat bites, creating a hearty and satisfying flavor fusion.",
                image = "file:///android_asset/images/fries/CheeseFrieswithMeatChunks.png",
                price = "340.00",
                starReview = 4
            ),
            Food(
                id = 702,
                name = "Fries",
                description = "Savor the golden goodness of our classic Fries, expertly crafted to achieve the ideal balance of crispiness and tenderness, providing the perfect accompaniment to any meal or a delightful snack on their own.",
                image = "file:///android_asset/images/fries/Fries.png",
                price = "90.00",
                starReview = 3
            ),
            Food(
                id = 703,
                name = "Onion Rings",
                description = "Delight in the crispy perfection of our Onion Rings, where thinly sliced onions are coated in a golden batter and fried to a delightful crunch, offering a savory experience that's both crispy and flavorful.",
                image = "file:///android_asset/images/fries/OnionRings.png",
                price = "90.00",
                starReview = 3
            )
        )
    ),
    FoodCategory(
        id = 8,
        name = "Desserts",
        description = "Satisfy your sweet tooth with our decadent desserts, where indulgence takes center stage, and each dessert is a sublime combination of heavenly flavors and irresistible sweetness.",
        foods = listOf(
            Food(
                id = 801,
                name = "Choco Cupcake",
                description = "Satisfy your sweet cravings with our Choco Cupcake, a miniature delight bursting with rich chocolate flavor, crowned with a velvety swirl of chocolate frosting, promising a delightful escape into the world of cocoa-infused joy.",
                image = "file:///android_asset/images/dessert/ChocoCupcake.png",
                price = "110.00",
                starReview = 4
            ),
            Food(
                id = 802,
                name = "Choco Donut",
                description = "Experience a heavenly treat with our Choco Donut, where the soft and pillowy donut meets a glossy layer of chocolate glaze, creating a delightful harmony of sweetness and indulgence in every bite.",
                image = "file:///android_asset/images/dessert/ChocoDonut.png",
                price = "110.00",
                starReview = 4
            ),
            Food(
                id = 803,
                name = "Chocolate Cake",
                description = "Indulge in the divine richness of our Chocolate Cake, a decadent creation that melts in your mouth with layers of moist chocolate perfection, leaving your taste buds in a state of pure bliss.",
                image = "file:///android_asset/images/dessert/ChocolateCake.png",
                price = "110.00",
                starReview = 4
            ),
            Food(
                id = 804,
                name = "Choco Velvet Slice Delight",
                description = "It's a delectable slice of chocolate powdered cake that promises a rich, velvety indulgence in every bite.",
                image = "file:///android_asset/images/dessert/ChocoVelvetSliceDelight.png",
                price = "110.00",
                starReview = 4
            )
        )
    ),
    FoodCategory(
        id = 9,
        name = "Drinks",
        description = "Quench your thirst with our refreshing beverage selection, crafted with care to complement every dish on our menu, providing the perfect sip for every mood.",
        foods = listOf(
            Food(
                id = 901,
                name = "Choco Cookie Cream",
                description = "Delight in the heavenly fusion of chocolate bliss and cookie crunch with our Choco Cookie Cream, a luscious concoction that marries the richness of chocolate with the delightful texture of creamy cookies, promising a taste of pure indulgence.",
                image = "file:///android_asset/images/drinks/ChocoCookieCream.png",
                price = "190.00",
                starReview = 4
            ),
            Food(
                id = 902,
                name = "Dark Caramel Frappe",
                description = "Experience the velvety allure of our Dark Caramel Frappe, a decadent fusion of intense dark caramel and smooth blended ice, crafting a rich and indulgent treat that is as luxurious as it is refreshing.",
                image = "file:///android_asset/images/drinks/DarkCaramelFrappe.png",
                price = "190.00",
                starReview = 4
            ),
            Food(
                id = 903,
                name = "Strawberry Frappe",
                description = "Dive into the refreshing embrace of our Strawberry Frappe, where luscious strawberries come together with creamy indulgence, creating a delightful and chilled symphony of sweetness.",
                image = "file:///android_asset/images/drinks/StrawberryFrappe.png",
                price = "190.00",
                starReview = 4
            )
        )
    ),
    FoodCategory(
        id = 10,
        name = "Coffee",
        description = "Awaken your senses with the rich aroma and bold flavors of our premium coffee blends, expertly brewed to perfection, offering a delightful caffeine kick for the coffee connoisseur in you.",
        foods = listOf(
            Food(
                id = 1001,
                name = "Black Coffee",
                description = "Savor the pure essence of coffee in its most unadulterated form with our black coffee, a soul-stirring brew that highlights the intricate flavors and aromatic richness of the finest coffee beans.",
                image = "file:///android_asset/images/coffee/blackcoffee.png",
                price = "90.00",
                starReview = 4
            ),
            Food(
                id = 1002,
                name = "Espresso",
                description = "Experience the bold and robust character of our carefully crafted espresso, a concentrated essence of premium coffee beans that promises a powerful yet nuanced coffee journey.",
                image = "file:///android_asset/images/coffee/espresso.png",
                price = "90.00",
                starReview = 4
            ),
            Food(
                id = 1003,
                name = "Caramel Macchiato",
                description = "Indulge in the harmonious dance of rich espresso and velvety steamed milk, beautifully adorned with ribbons of luscious caramel—a decadent symphony for your senses.",
                image = "file:///android_asset/images/coffee/caramelmachiatto.png",
                price = "140.00",
                starReview = 4
            )
        )
    )
)


