<#ftl encoding="Windows-1251"/>
<#--<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>-->
<!doctype html>
<html>
<head>
    <meta charset="Windows-1251">

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

<body class="home">

<!-- LOGIN POP UPS -->
<div id="popup-overlay"></div>
<div class="popup" id="popup-login">
    <h2>Вход</h2>
    <hr class="separator">
    <form method="post" action="/index/process" class="form clearfix">
        <fieldset>
            <label for="login-username">Логин:</label>
            <input type="text" name="login" id="login-username" class="input text">
            <label for="login-password">Пароль:</label>
            <input type="password" name="password" id="login-password" class="input text">
        </fieldset>
        <div class="checks">
            <div class="check-row">
                <label for="remember-me">Запомнить меня:</label>
                <input type="checkbox" id="remember-me" name="remember-me" class="input checkbox">
            </div>
        </div>

        <hr class="separator">
        <button type="submit" class="button submit">Вход</button>
        <a class="close" href="#"></a>
    </form>
</div>



<div class="popup" id="popup-register">


    <#--<h2>Регистрация</h2>-->
    <#--<hr class="separator">-->
<#--<@form.form role = form method="post" action="/index" cssClass="form clearfix">-->
    <#--&lt;#&ndash;<fieldset>&ndash;&gt;-->
    <#--<label for="login-username">Логин:</label>-->
        <#--<@form.input cssClass="input text" id="login-username" type="text" path="login" id="login"/>-->
        <#--<@form.errors path="login" cssStyle="color: red;" />-->
        <#--<label for="login-email">Телефон:</label>-->
        <#--<@form.input name="phone" type = "number" path= "phone" id="login-email" cssClass="input text"/>-->
        <#--<@form.errors path="phone" cssStyle="color: red;" />-->
        <#--<label for="login-password">Пароль:</label>-->
        <#--<@form.input type="password"  path="password" id="login-password" cssClass="input text"/>-->
        <#--<@form.errors path="password" cssStyle="color: red;" />-->
        <#--<label for="login-password">Повторите пароль:</label>-->
        <#--<@form.input type="password"  path="repassword" id="login-password" cssClass="input text"/>-->
        <#--<@form.errors path="repassword" cssStyle="color: red;" />-->
    <#--&lt;#&ndash;</fieldset>&ndash;&gt;-->
    <#--<hr class="separator">-->
    <#--<button title="submit" class="button submit">Зарегистррироваться</button>-->
<#--</@form.form>-->


        <h2>Регистрация</h2>
        <hr class="separator">
        <form method="post" name="reg" action="/index" class="form clearfix">
            <fieldset>
                <label for="loginreg">Логин:</label>
                <input type="text" name="login" id="loginreg" class="input text" onchange="responseLogin()">
                <br>
                <p class="login_msg" id="infologin"></p>
                <label for="phone">Телефон:</label>
                <input type="text" name="phone" id="phone" class="input text" onchange="responsePhone()" >
                <br>
                <p class="phone_msg" id="infophone"></p>
                <label for="password">Пароль:</label>
                <input type="password" name="password" id="password" class="input text">
                <label for="repassword">Повторите пароль:</label>
                <input type="password" name="repassword" id="repassword" class="input text">
                <br>
                <p class="pass_msg" id="info"></p>
            </fieldset>


            <hr class="separator">

            <button title="submit" class="button submit">Зарегистррироваться</button>
        </form>
                <a class="close" href="#"></a>
                </div>
            <!-- END LOGIN POP UPS -->
            <div class='wrapper'>
                <header>
                    <div class="top-nav">
                        <nav>
                            <ul>
                                <#if user == "anonymousUser">
                                    <li><a href="#" id="login-btn">Вход</a></li>
                                    <li><a href="#" class="register-btn">Регистрация</a></li>
                                <#else >
                                    <li><a href="/default">Мой профиль</a></li>
                                    <li><a href="/logout">Выход</a></li>
                                </#if>
                            </ul>
                        </nav>

                        <form class="search-form" method="post">
                            <input type="text" class="search" placeholder="Search for product">
                            <input type="submit" class="search-submit" value="">
                        </form>

                    </div>
                    <a href="/index" class="logo"><img src="/images/logo.png" alt="your logo"/></a>
                    <nav class="main-menu">
                        <ul>
                            <li id="lava-elm"></li>
                            <li class="current">
                                <form action="/listing">
                                    <button type="submit" value="KOMBO" name="type">Набаоры</button>
                                </form>
                            </li>
                            <li>
                                <form action="/listing">
                                    <button type="submit" value="PIZZA" name="type">Пицца</button>
                                </form>
                            </li>
                            <li>
                                <form action="/listing">
                                    <button type="submit" value="ROLL" name="type">Роллы</button>
                                </form>
                            </li>
                            <li>
                                <form action="/listing">
                                    <button type="submit" value="DRINK" name="type">Напитки</button>
                                </form>
                            </li>
                            <li>
                                <form action="/listing">
                                    <button type="submit" value="DESERT" name="type">Десерты</button>
                                </form>
                            </li>
                            <li>
                                <form action="/listing">
                                    <button type="submit" value="WOK" name="type">Вок</button>
                                </form>
                            </li>
                            <li>
                                <form action="/listing">
                                    <button type="submit" value="ANOTHER" name="type">Дополнительно</button>
                                </form>
                            </li>
                        </ul>
                    </nav>
                    <div class="header-slider-canvas">
                        <div class="parts part-1"></div>
                        <div class="parts part-2"></div>
                        <div class="parts part-3"></div>
                    </div>

                    <ul id="mycarousel" class="jcarousel-skin-header-slider">
                        <#list productsSlider as p>
                            <li><img src="${p.getPhoto()}" width="680px" height="464" alt=""/>

                                <div class="description"><span class='price'>${p.getPrice()}</span><span
                                        class='name'>${p.getName()}</span>

                                    <form action="/single" method="get">
                                        <button type="submit" name="productname" value=${p.getName()}>Подробнее</button>
                                    </form>
                            </li>
                        </#list>
                    </ul>
                </header>
                <div class="content clearfix">
                    <div id="meals-of-the-day">
                        <h3 class="title-separator"><span class="title">Новинки</span><span class="sep"></span></h3>
                        <ul>
                            <#list productsOfDay  as prodOfDay>
                                <li class="meal">
                                    <div class="img-holder"><img src=${prodOfDay.getPhoto()} alt=""></div>
                                    <div class="desc-holder">
                                        <form action="/single" method="get">
                                            <button type="submit" id="indextosinglebutton" name="productname"
                                                    value=${prodOfDay.getName()}>${prodOfDay.getName()}</button>
                                        </form>
                                        <span class="price">${prodOfDay.getPrice()}</span>

                                        <form action="/cart" method="post">
                                            <button type="submit" name="productname" class="add-to-cart-button"
                                                    value=${prodOfDay.getName()}>В корзину
                                            </button>
                                        </form>
                                    </div>
                                </li>
                            </#list>
                        </ul>
                    </div>
                    <h3 class="title-separator"><span class="title">Особые блюда</span><span class="sep"></span></h3>


                    <div id="featured-meals">
                        <ul>
                            <#list productsFeatured as prodFeatured>
                                <li class="meal">
                                    <div class="img-holder"><img src=${prodFeatured.getPhoto()} alt=""></div>
                                    <form action="/single" method="get">
                                        <button type="submit" id="indextosinglebutton" name="productname"
                                                value=${prodFeatured.getName()}>${prodFeatured.getName()}</button>
                                    </form>
                                    <span class="price">${prodFeatured.getPrice()}</span>

                                    <form action="/cart" method="post">
                                        <button type="submit" name="productname" class="add-to-cart-button"
                                                value=${prodFeatured.getName()}>В корзину
                                        </button>
                                    </form>
                                </li>
                            </#list>
                        </ul>
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
                                <input type="text" placeholder="Email"><input type="submit" value="Submit"
                                                                              class="submit-button">
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


            <script type="text/javascript" src="/js/libs/jquery-1.7.1.min.js"></script>
            <script src="/js/libs/jquery.easing.1.3.js"></script>
            <script src="/js/script.js"></script>
            <script src="/js/validator.js"></script>
            <script src="/js/libs/jquery.jcarousel.min.js"></script>

            <script type="text/javascript">
                // FRONT SLIDER STARTER
                jQuery(document).ready(function () {
                    jQuery('#mycarousel').jcarousel({
                        auto: 3,
                        wrap: 'last',
                        scroll: 1,
                        animation: 'slow',
                        initCallback: mycarousel_initCallback,
                    });
                });
            </script>

            </html>