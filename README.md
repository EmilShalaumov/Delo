# Delo
Raiffeisen.Delo ServerApplication 

Запросы на сервер

Добавление счёта<br/>
POST localhost:8078/demo/addaccount<br/>
{<br/>
"user_id":"3",                 //идентификатор пользователя<br/>
"open_date":"2019-09-10",      //дата открытия<br/>
"expire_date":"2023-09-10",		 //дата истечения<br/>
"number":"2202200287563345",   //номер<br/>
"balance":"450000",						 //баланс<br/>
"status":"1",									 //статус счета<br/>
"currency":"1"								 //валюта<br/>
}<br/>

Добавление карты<br/>
POST localhost:8078/demo/addcard<br/>
{
"account_id":"43",            //идентификатор счета<br/>
"open_date":"2019-08-23",     //дата открытия<br/>
"expire_date":"2023-08-23",   //дата истечения<br/>
"number":"1101324523768890",  //номер<br/>
"status":"1",                 //статус карты<br/>
"product_id":"1"              //идентификатор продукта<br/>
}<br/>

Добавление заказа<br/>
POST localhost:8078/demo/addorder<br/>
{<br/>
"total_price":6590,   //сумма заказа<br/>
"customer_type":2,    //тип покупателя(ИП, ФЛ, ЮЛ)<br/>
"form_of_payment":1,  //форма олпаты<br/>
"account_id":43       //идентификатор счета<br/>
}<br/>

Добавление транзакции<br/>
localhost:8078/demo/addtransaction<br/>
{<br/>
"account_id":"43", 		//идентификатор счета<br/>
"card_id":"44",				//идентификатор карты<br/>
"type":"9",						//тип транзакции<br/>
"amount":"5000",			//размер<br/>
"post_status":"1",		//статус транзакции<br/>
"account_from":"1"		//счет отправителя<br/>
}<br/>

Формирование и добавление транзакции по заказу<br/>
POST localhost:8078/demo/addtransactionfororder?order_id=14<br/>
{<br/>
"total_price":6590,		//сумма транзакции<br/>
"customer_type":2,		//тип покупателя<br/>
"form_of_payment":1,	//форма платежа<br/>
"account_id":43				//идентификатор аккаунта<br/>
}<br/>

Получить список счетов<br/>
GET localhost:8078/demo/accounts<br/>

Получить список карт<br/>
GET localhost:8078/demo/cards<br/>

Получить список заказов<br/>
GET localhost:8078/demo/orders<br/>

Получить список транзакций<br/>
GET localhost:8078/demo/transactions<br/>
