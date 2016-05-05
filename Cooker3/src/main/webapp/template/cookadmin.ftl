<!doctype html>
<html>
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <title>Cooker</title>
    <meta name="description" content="">
    <meta name="author" content="">

<#--<link rel="stylesheet" href="../css/superfish.css">-->

    <link rel="stylesheet" href="../css/style.css?v=2">


    <!-- All JavaScript at the bottom, except for Modernizr which enables HTML5 elements & feature detects -->
    <script src="../js/libs/modernizr-1.7.min.js"></script>


</head>

<body>


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
        <a href="/index" class="logo"><img src="../images/logo.png" alt="your logo"/></a>

    </header>
    <div class="content full-content clearfix">

        <div class="breadcrumbs">
            <ul>
                <li><a href="/index">Главная</a></li>
                <li>Заказы</li>
            </ul>
        </div>

        <div class="product-menu-header">
            <h2>
                <div class="text-center">Заказы</div>
            </h2>
        </div>

        <div class="product-menu-holder">


            <div class="text-center">
                <div class="left-part">
                    <h3>Заказы в очереди</h3>

                <#--<div class="topmenu">-->
                <#--<ul>-->
                <#--<li id="menu1"><a href="#" title="Меню 1">Показать заказы:</a>-->
                <#--<ul>-->
                <#--<li><a href="#" onclick="change('all')">Все</a></li>-->
                <#--<li><a href="#" onclick="change('ready')">Готовые</a></li>-->
                <#--<li><a href="#" onclick="change('notready')">Не готовые</a></li>-->
                <#--</ul>-->
                <#--<input id = "select"  type="hidden" value="notready">-->
                <#--</li>-->
                <#--</ul>-->
                <#--</div>-->

                <#--<select class="select-dropdown" id="type-subject" name="select" >-->
                <#--<option  onclick="change('all')">Все</option>-->
                <#--<option  onclick="change('ready')">Готовые</option>-->
                <#--<option onclick="change('notready')">Не готовые</option>-->
                <#--</select>-->

                    <div class="text-center">
                    <div class="ajaxnav">
                        <a onclick="change('all')">Все</a>
                        <a onclick="change('notready')">Не отправленные</a>
                    </div>

                    <input id="select" type="hidden" value="notready">
                    </div>

                    <ul>
                        <div id="res"></div>
                    <#--<#if orders??>-->


                    <#--<#list orders as o>-->
                    <#--<li>-->
                    <#--<h4><span class="text">${o.getId()}</span><span class="line"></span></h4>-->
                    <#--<!--<div class="img-holder"><div class="canvas"></div><img src="images/meal-15.jpg" alt=""></div>&ndash;&gt;-->
                    <#--<div class="price">-->
                    <#--<h5><a >${o.getUser().getLogin()}</a></h5>-->
                    <#--<span>${o.getDate()}</span>-->
                    <#--</div>-->
                    <#--<div class="description">-->
                    <#--<b>Заказ:</b>-->
                    <#--<#list o.getProductinorderList() as product>-->
                    <#--${product.getProduct().getName()},-->
                    <#--</#list>-->
                    <#--<br>-->
                    <#--<b>Сумма :</b>${o.getPrice()}-->
                    <#--<br>-->
                    <#--<b>Адрес: </b>${o.getAddress()}-->
                    <#--<br>-->
                    <#--<b> Телефон: </b>${o.getUser().getPhone()}-->
                    <#--<br>-->
                    <#--<b>Примечание: </b>-->
                    <#--<#if o.getNote()??>-->
                    <#--${o.getNote()}-->
                    <#--</#if>-->
                    <#--</div>-->
                    <#--<#if o.getStatus() = false>-->
                    <#--<div class="status">-->
                    <#--<form action="/cookadmin" method="post">-->
                    <#--Заказ готов: <input type="checkbox" name="checkbox" value="true">-->
                    <#--<button type="submit"  name="orderId" value=${o.getId()}  class="add-to-cart-button">ok</button>-->
                    <#--</form>-->
                    <#--</div>-->
                    <#--</#if>-->

                    <#--</li>-->
                    <#--</#list>-->
                    <#--<#else >-->
                    <#--пока ниче нет-->
                    <#--</#if>-->

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
<script type="text/javascript" src="/js/libs/jquery-1.7.1.min.js"></script>
<script src="../js/libs/jquery.easing.1.3.js"></script>
<script src="../js/script.js"></script>
<script src="../js/ajax.js"></script>
<script src="../js/libs/jquery.jcarousel.min.js"></script>


</body>
</html>