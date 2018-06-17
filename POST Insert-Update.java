RequestQueue requestQueue = Volley.newRequestQueue(context);
/*
* Replace the below URL and point it to your URL:
*/
String URL = "http://vishnuanand.in/test207/update.php";
StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
		@Override
		public void onResponse(String s) {
			Log.v("Location Updated", s);
		}
}, new Response.ErrorListener() {
		@Override
		public void onErrorResponse(VolleyError volleyError) {
			Log.v("Location not Updated", "Don't know the reason");
		}
}) {

/*
* getParams function will be called while the queue requests to the URL, so we need to provide data by creating a String Map,
* and by putting parameters into it. Example: If you wrote ##### $var=$_POST['var1']; ##### in PHP to get var1 from the request.
* You should put the key as var1 in String Map. Example : ##### params.put("var1", "value"); #####
*/

		@Override
		protected Map<String, String> getParams() {
			Map<String, String> params = new HashMap<String, String>();
			params.put("lat", String.valueOf(latitude));
			params.put("long", String.valueOf(longitude));
			params.put("person", username);
			return params;
  }
};
requestQueue.add(stringRequest);
