# spring-boot-content-negotiation

# How to verify

The following two calls will invoke the same controller.

```
curl http://localhost:8089/greetings
curl http://localhost:8089/greetings.json
```

# Note

Please note the following comments from the spring documentation before using this feature.

```
Suffix Match
By default, Spring MVC performs .* suffix pattern matching so that a controller mapped to /person is also implicitly mapped to /person.*. The file extension is then used to interpret the requested content type to use for the response (that is, instead of the Accept header) — for example, /person.pdf, /person.xml, and others.

Using file extensions in this way was necessary when browsers used to send Accept headers that were hard to interpret consistently. At present, that is no longer a necessity and using the Accept header should be the preferred choice.

Over time, the use of file name extensions has proven problematic in a variety of ways. It can cause ambiguity when overlain with the use of URI variables, path parameters, and URI encoding. Reasoning about URL-based authorization and security (see next section for more details) also become more difficult.
```

[mvc-ann-requestmapping-suffix-pattern-match](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-ann-requestmapping-suffix-pattern-match)