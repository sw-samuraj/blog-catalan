# blog-catalan

A trial Clojure project for a blog post about the [Catalan Numbers](https://en.wikipedia.org/wiki/Catalan_number).

## Usage

The project contains three basic functions:

* `factorial` counts a factorial.
* `binomial` counts a binomial coefficient.
* `catalan` counts a Catalan number.

All these funcitons build on top of each other - `catalan` uses `binomial` which uses `factorial`.

Additionally, there is a function `catalans` which returns a lazy sequence of the Catalan numbers.

### Midje tests

You can run all [Midje](https://github.com/marick/Midje) tests by `lein midje`.

### REPL

You can load the functions into the REPL with:

```clojure
(require '[blog-catalan.core :as c])

(c/catalan 5)
```

## License

Copyright © 2017 Vít Kotačka

Distributed under the [Eclipse Public License](https://eclipse.org/org/documents/epl-v10.php)
either version 1.0 or (at your option) any later version.
