# Spring Java Notes

## Initial notes

`@RestController` - is basically something that routes requests in an application. this will be shown as the URLs to the browser.

spring boot will come with a built in tomcat server

`@RequestMapping` will take one or multiple arguments ex: (value = "/", method = RequestMethod.Get)
This request mapping can be done at the method level and class level which will have different levels from the class level but they will be nested

For request mapping the annotation can be rewritten like so `@RequestMapping("/basic")` because all of the request mappings by default are get methods so the extra verbiage is not needed unless other types of methods are to be used.

`@RequestMapping(value="user_greeting", method = RequestMethod.POST)` example for handling a post request, example used was for a form. Also this will be attached to a function inside a class.

Reminder a controller is used to route requests

When dealing with POST methods it may be difficult to get access to the parameters that where posted from the main method. To get access to these parameters you will need to use `@RequestParam` at the method level in order to get access to the post parameters. Example used `public String printUserGreeting(@RequestParam String firstName, @RequestParam String lastName){}` this will give access to the firstName and lastName values from the POST request being sent to it.

Path variable usage: when using path variables in paths a new annotation will have to be used 
example will be '/orders/{id}' meaning that here the path variable will be the id, to use this you will need to use `@PathVariable String id` inside the method arguments in order to have access to this. 