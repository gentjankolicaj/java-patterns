In oop , the iterator pattern is a design pattern in which an iterator(object) is used to traverse a
container and
access
the container's elements.The iterator pattern decouples algorithms from containers, in some cases
algorithms are
necessarily
container-specific and thus cannot be applied.
<br>
For example, the hypothetical algorithm SearchForElement can be implemented generally using a
specified type of iterator
rather than implementing it as a container-specific algorithm. This allows SearchForElement to be
used on any container
that supports the required type of iterator.