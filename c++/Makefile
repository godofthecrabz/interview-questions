TARGET=$(CURDIR)/target
$(info $(TARGET))
dummy:=$(shell mkdir -p $(TARGET))

.DEFAULT: all

.PHONY: all clean

all: src/test.cpp

src/test.cpp:
	$(CXX) $(CXXFLAGS) -o $(TARGET)/lru_cpp /usr/src/test.cpp

clean:
	-rm -rf target
