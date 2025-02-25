# Get the GCC preinstalled image from Docker Hub
FROM gcc

# Copy the current folder which contains C++ source code to the Docker image under /usr/src
COPY src /usr/src/
COPY Makefile /usr/src/

# Specify the working directory
WORKDIR /usr/src/

# Use GCC to compile the Test.cpp source file
RUN make

# Run the program output from the previous step
CMD ["./target/lru_cpp"]
