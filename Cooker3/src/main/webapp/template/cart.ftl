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

<!-- LOGIN POP UPS -->
<div id="popup-overlay"></div>
<div class="popup" id="popup-login">
    <h2>Login form</h2>
    <hr class="separator">
    <form method="post" action="" class="form clearfix">
        <fieldset>
            <label for="login-username">Username:</label>
            <input type="text" name="" id="login-username" class="input text">
            <label for="login-password">Password:</label>
            <input type="password" name="" id="login-password" class="input text">
        </fieldset>
    </form>
    <hr class="separator">
    <button class="button submit">Login</button>
    <div class="links"><a href="#">Forgotten password </a> | <a href="#" class="register-btn"> New account</a></div>
    <a class="close" href="#"></a>
</div>
<div class="popup" id="popup-register">
    <h2>Registration form</h2>
    <hr class="separator">
    <form method="post" action="" class="form clearfix">
        <fieldset>
            <label for="login-username">Username:</label>
            <input type="text" name="" id="login-username" class="input text">
            <label for="login-email">Email:</label>
            <input type="text" name="" id="login-email" class="input text error" value="Error">
            <label for="login-password">Password:</label>
            <input type="password" name="" id="login-password" class="input text">
            <label for="login-confirm-password">Confirm password:</label>
            <input type="password" name="" id="login-confirm-password" class="input text">
        </fieldset>

        <hr class="separator">

        <div class="checks">
            <div class="check-row">
                <label><input type="checkbox" class="input checkbox">I have read and agree to the <a href="#">Terms &amp; Conditions</a></label>
            </div>
            <div class="check-row">
                <label><input type="checkbox" class="input checkbox">I agree to recieve promotional mails</label>
            </div>
        </div>

        <button class="button submit">Register now</button>
    </form>
    <a class="close" href="#"></a>
</div>
<!-- END LOGIN POP UPS -->
<div class='wrapper'>
    <header>
        <div class="top-nav">
            <nav>
                <ul>
                    <li><a href="/default">Мой профиль</a></li>
                    <li><a href="/logout">Выйти</a></li>
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
                <li><a href="/index">Главная</a></li>
                <li>Корзина</li>
            </ul>
        </div>
        <div class="left-content">
            <h2 class="heading">Корзина</h2>
            <div class="shopping-cart">
                <div class="list">
                    <#if productsInCart?has_content>

                    <ul>
                    <#list productsInCart as p>
                        <li>
                            <div class="head">
                                <div class="cell item">Товар</div>
                                <#--<div class="cell quantity">Количество</div>-->
                                <div class="cell item-price">Цена</div>
                                <#--<div class="cell item-total">Итого</div>-->
                            </div>
                            <div class="body">
                                <div class="cell item">
                                    <div class="image">
                                        <img src= ${p.getPhoto()} alt="">
                                    </div>
                                    <div class="descr">
                                        <h3>${p.getName()}</h3>
                                        <p>${p.getDescription()}.</p>
                                    </div>
                                </div>
                                <#--<div class="cell quantity">-->
                                    <#--<input type="text" name="" value="1">-->
                                <#--</div>-->
                                <div class="cell item-price">
                                    ${p.getPrice()}
                                </div>
                                <#--<div class="cell item-total">-->
                                    <#--???-->
                                <#--</div>-->
                            </div>
                            <form action="/cart/removeProduct">
                            <button type="submit" class="remove" name="prodremove" value="${p.getName()}">X</>
                            </form>
                        </li>
                    </#list>
                        <#else >
                            <h3 class="heading">У вас пока нет товаров в корзине</h3>
                    </#if>

                    </ul>
                </div>
                <div class="totals">
                    <ul>
                        <li class="total">Итого: <mark>${summa}</mark></li>
                    </ul>
                </div>
                <div class="buttons">
                    <a class="button" href="/index">Продолжить</a>
                    <a class="button" href="/cart/clear">Очистить корзину</a>
                </div>
            </div>

            <div class="checkout">
                <form action="/cart/getOrder" method="post">
                <div id="payment-methods">
                    <span class="label">Выберите способ оплаты:</span>
                    <div class="fatty-belt">
                        <ul>
                            <li>
                                <div class="logo"><img src="../images/payment-option.jpg" alt=""></div>
                                <div class="form-controls radio"><input type="radio" name="payment_option" value="money" checked="checked"></div>
                            </li>
                            <li>
                                <div class="logo"><img src="../images/bonus.jpg" alt=""></div>
                                <div class="form-controls radio"><input type="radio" name="payment_option" value="bonus"></div>
                            </li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>

                <div class="discount">

                    <label for="checkout-discount-code">Укажите адрес:</label>
                    <input type="text" name="address" id="checkout-discount-code">
                        <label for="checkout-discount-code">Примечания:</label>
                        <input type="text" name="note" id="checkout-discount-code">
                        <button type="submit" class="button">Заказать</button>

                </div>
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


            <div class="separator dark box-and-meals"></div>

            <div class="featured-meals">

                <h2 class="heading">Особые блюда</h2>

                <div class="prev-next-buttons">
                    <a href="#" class="prev"></a>
                    <a href="#" class="next"></a>
                </div>

                <div class="block meal">
                    <ul>
                        <#list productsFeatured as prodFeatured>
                            <li class="meal">
                                <div class="img-holder"><img src=${prodFeatured.getPhoto()} alt=""></div>
                                <h1><a href="#">${prodFeatured.getName()}</a></h1>
                                <p>${prodFeatured.getDescription()}</p>
                                <span class="price">${prodFeatured.getPrice()}</span>
                                <form action="/cart" method="post">
                                    <button type="submit" name="productname" class="add-to-cart-button" value=${prodFeatured.getName()}>В корзину</button>
                                </form>
                            </li>
                        </#list>
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
</body>
<script type="text/javascript" src="../js/libs/jquery-1.7.1.min.js"></script>
<script src="../js/libs/jquery.easing.1.3.js"></script>
<script src="../js/script.js"></script>
<script src="../js/libs/jquery.jcarousel.min.js"></script>
</html>