# HTTP-Request-Android
Simple code for requesting and handling http response to work with and PHP MySQL.

Your android application can be 2 types.
  
 #### 1. Storing a note in your phone.
 
 ![](http://code.vishnuanand.in/AndroidHTTP/edittext-button.PNG)
 
 If you created an application that has a textbox/editText and a button where you can type data and store it in your phone. The database we will be using is SQLite which is inbuilt in your android device. The limitation is, the data you stored in your phone wont be visible in other persons phone if they too have your application. Because there isn't any active connection between the application for sharing the data.
 
 #### 2. Storing a note in the server.
 
 If you need an Application like Whatsapp/Facebook you need to store data over internet. So, if you're creating an account, the data will be stored in the Server's MySQL Database using Internet (or any other database service like Firebase). The advantage is, if you access your account by using your credentials (Username/Password) you can access the data.
  

### POST Request for Insert data

By using this method, you can easily insert or update data in your server. You need to create a PHP code in your Server or localhost.
