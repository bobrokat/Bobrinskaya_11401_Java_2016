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
    <div class="content full-content clearfix">
        <div class="breadcrumbs">
            <ul>
                <li><a href="/index">Главная</a></li>
                <li>Мой Профиль</li>
            </ul>
        </div>

        <h1>${user.getLogin()}</h1>

            <h2>${user.getPhone()}</h2>
        <hr>
                <h3>Мои бонусы:</h3>
                    <p>${user.getBonus()}</p>

                    <hr>

                    <blockquote>
                        <strong>Мои заказы:</strong>
                        <ul>
                        <#if user.getOrders()?has_content>

                            <#list user.getOrders() as o>
                                <li>${o.getDate()}
                                    <br>
                                    <#list o.getProductinorderList() as product>
                                    ${product.getProduct().getName()},
                                    </#list>
                                    <br>
                                    <#if o.getStatus() = true>
                                    <b>Доставлено</b>
                                        <#else >
                                    <b>Не доставлено</b>
                                    </#if>
                                    <br>
                                    <br>
                                </li>
                            </#list>

                        <#else >
                        У вас пока нет заказов...
                        </#if>
                    </ul>
                    </blockquote>


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