# gradle-multiappstartscript-example

An example of building an executable java application with Gradle that has multiple start scripts.

This example builds a simple Java application that has a start script for standalone usage and a start script for when it
is run within a Docker container. Each start script supplies the `example.deployment` JVM argument with a different value depending 
on where the application is running.

## Building the Example
Run the following command to build the example application:

    ./gradlew clean buildImage

## Running the Example

1. Run the following command to start the example application in standalone mode:

        ./gradlew run
        
    If successful, you will see that the jvm argument `example.deployment` has been set to `Standalone`:

        Starting gradle-multiappstartscript-example...
        -Dexample.deployment=Standalone
        
2. Run the following command to start the example application as a Docker container:

        docker run gregnetifi/gradle-multiappstartscript-example
        
    If successful, you will see that the jvm argument `example.deployment` has been set to `Docker`:

        Starting gradle-multiappstartscript-example...
        -Dexample.deployment=Docker

## License
MIT License

Copyright (c) 2019 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.