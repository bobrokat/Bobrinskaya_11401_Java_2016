<!doctype html>
<html>
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <title>Cooker</title>
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="shortcut icon" href="/favicon.ico">
    <link rel="stylesheet" href="../css/style.css?v=2">
    <link rel="stylesheet" href="../css/jcarousel.css">

    <!-- All JavaScript at the bottom, except for Modernizr which enables HTML5 elements & feature detects -->
    <script src="../js/libs/modernizr-1.7.min.js"></script>
</head>

<body>


<div class='wrapper'>
    <header>
        <div class="top-nav">
            <nav>
                <ul>
                <#if user == "anonymousUser">
                <#else >
                    <li><a href="/default">Мой профиль</a></li>
                    <li><a href="/logout">Выйти</a></li>
                </#if>
                </ul>
            </nav>

            <form class="search-form" method="post">
                <input type="text" class="search" placeholder="Search for product">
                <input type="submit" class="search-submit" value="">
            </form>

        </div>
        <a href="/index" class="logo"><img src="../images/logo.png" alt="your logo" /></a>
        <nav class="main-menu">
            <ul>
                <li id="lava-elm"></li>
                <li class="current"><form action="/listing" >
                    <button type="submit" value="KOMBO" name="type">Наборы</button>
                </form></li>
                <li>
                    <form action="/listing" >
                        <button type="submit" value="PIZZA" name="type">Пицца</button>
                    </form></li>
                <li><form action="/listing" >
                    <button type="submit" value="ROLL" name="type">Роллы</button>
                </form></li>
                <li><form action="/listing" >
                    <button type="submit" value="DRINK" name="type">Напитки</button>
                </form></li>
                <li><form action="/listing" >
                    <button type="submit" value="DESERT" name="type">Десерты</button>
                </form></li>
                <li><form action="/listing" >
                    <button type="submit" value="WOK" name="type">Вок</button>
                </form></li>
                <li><form action="/listing" >
                    <button type="submit" value="ANOTHER" name="type">Дополнительно</button>
                </form></li>
            </ul>
        </nav>
    </header>
    <div class="content clearfix">
        <div class="breadcrumbs">
            <ul>
                <li><a href="#">Home</a></li>
                <li>Entrees</li>
            </ul>
        </div>
        <div class="left-content">
            <div class="meal-details single">
                <h1>${p.getName()}</h1>

                <div class="image"><img src="${p.getPhoto()}" alt=""></div>
                <p class="descr">${p.getDescription()} </p>

                <hr/>

                <span class="price">${p.getPrice()}</span>
                <form action="/cart" method="post">
                    <button type="submit" name="productname" class="add-to-cart-button" value=${p.getName()}>В корзину</button>
                </form>
                <div class="rating">
                    <div class="rating-over" style="width:60%"></div>
                </div>

                <hr/>

                <div class="comments">
                    <h2 class="heading">3 Comments</h2>
                    <ul>
                        <li>
                            <div class="avatar"><img src="../main/web/WEB-INF/images/comment-author.jpg" alt=""></div>
                            <div class="data">
                                <div class="author">Porl <time datetime="">09 May, 2011</time></div>
                                <p>Vestibulum ut leo erat. Integer ac est at enim suscipit vulputate. Phasellus ante erat, euismod et posuere ut, convallis sit amet tellus. Nulla in elit non erat tempus luctus at a est. Nullam non orci tortor. </p>
                            </div>
                        </li>

                        <li>
                            <div class="avatar"><img src="../main/web/WEB-INF/images/comment-author.jpg" alt=""></div>
                            <div class="data">
                                <div class="author">Porl <time datetime="">09 May, 2011</time></div>
                                <p>Vestibulum ut leo erat. Integer ac est at enim suscipit vulputate. Phasellus ante erat, euismod et posuere ut, convallis sit amet tellus. Nulla in elit non erat tempus luctus at a est. Nullam non orci tortor. </p>
                            </div>
                        </li>

                        <li>
                            <div class="avatar"><img src="../main/web/WEB-INF/images/comment-author.jpg" alt=""></div>
                            <div class="data">
                                <div class="author">Porl <time datetime="">09 May, 2011</time></div>
                                <p>Vestibulum ut leo erat. Integer ac est at enim suscipit vulputate. Phasellus ante erat, euismod et posuere ut, convallis sit amet tellus. Nulla in elit non erat tempus luctus at a est. Nullam non orci tortor. </p>
                            </div>
                        </li>
                    </ul>
                </div>

                <hr />

                <h2 class="heading">Leave a Reply</h2>

                <form method="post" action="" class="form comment-form">
                    <fieldset>
                        <label for="contact-your-name">Your name: <span class="required">*</span></label>
                        <input type="text" id="contact-your-name" class="input text">
                        <label for="contact-your-email">Your website <span class="required">*</span></label>
                        <input type="text" id="contact-your-email" class="input text">
                        <label for="contact-details">Your message:</label>
                        <textarea id="contact-details" rows="30" cols="50" class="input textarea"></textarea>
                        <span class="required-desr">* required fields</span>
                        <button class="button">Submit</button>
                    </fieldset>
                </form>

            </div>
        </div>
        <div class="right-content">
            <div class="call-us">
                <span class="label">Call us now!</span>
                <span class="pop phone">0800/ 567 345</span>
                <span class="label">Working time:</span>
                <span class="pop">0-24h</span>
            </div>

            <div class="cart-box">
                <div class="top">Корзина</div>
                <div class="body">
                    <ul>
                        <li class="info">
                    </ul>
                    <a class="submit-button" href="/cart">Посмотреть</a>
                    <div class="graphic"></div>
                </div>
            </div>

            <hr />

            <div class="featured-meals">

                <h2 class="heading">Featured meals</h2>

                <div class="prev-next-buttons">
                    <a href="#" class="prev"></a>
                    <a href="#" class="next"></a>
                </div>

                <div class="block meal">
                    <ul>
                        <li>
                            <div class="image">
                                <img src="../main/web/WEB-INF/images/meal-8.jpg" alt="">
                            </div>
                            <h1>Skewers</h1>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing...</p>
                            <span class="price">$18.32</span>
                            <a href="check-out.html" class="add-to-cart-button">Add to cart</a>
                        </li>
                        <li>
                            <div class="image">
                                <img src="../main/web/WEB-INF/images/meal-8.jpg" alt="">
                            </div>
                            <h1>Skewers</h1>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing...</p>
                            <span class="price">$18.32</span>
                            <a href="check-out.html" class="add-to-cart-button">Add to cart</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<footer>
    <div class="footer-holder">
        <a href="" class="logo">Cooker Logo</a>
        <div class="newsletter">
            <div class="quote">
                <h6>Newsletter</h6>
                <p>Sign-up for our newsletter and be always aware of the new offers and services:</p>
                <form method="post">
                    <input type="text" placeholder="Email"><input type="submit" value="Submit" class="submit-button">
                </form>
            </div>
        </div>
        <div class="links first">
            <h6>follow us on...</h6>
            <ul>
                <li class="facebook"><a href="#">Facebook</a></li>
                <li class="twitter"><a href="#">Twitter</a></li>
                <li class="rss"><a href="#">Rss feed</a></li>
            </ul>
        </div>
        <div class="links">
            <h6>useful links</h6>
            <ul>
                <li><a href="#">Specials</a></li>
                <li><a href="#">New orders</a></li>
                <li><a href="#">Terms and conditions of use</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
                <li><a href="#">Sitemap</a></li>
            </ul>
        </div>
        <div class="links">
            <h6>categories</h6>
            <ul>
                <li><a href="#">Fruits and vegetables</a></li>
                <li><a href="#">Seafood</a></li>
                <li><a href="#">Meat</a></li>
                <li><a href="#">Entrees</a></li>
                <li><a href="#">Pizza and pasta</a></li>
                <li><a href="#">Desserts</a></li>
            </ul>
        </div>
        <div class="credits clearfix">
            Copyright &copy; 2011 Cooker. All rights reserved
        </div>
    </div>
</footer>
<script type="text/javascript" src="../js/libs/jquery-1.7.1.min.js"></script>
<script src="../js/libs/jquery.easing.1.3.js"></script>
<script src="../js/script.js"></script>
<script src="../js/libs/jquery.jcarousel.min.js"></script>
</body>
</html>