OUTPUT=ObserverPattern.png ObserverPattern2.png ThreadFactory.png

all: $(OUTPUT)

ObserverPattern.png: ObserverPattern.dia
	dia --export=$@ $<

ObserverPattern2.png: ObserverPattern2.dia
	dia --export=$@ $<

ThreadFactory.png: ThreadFactory.dia
	dia --export=$@ $<

clean:
	rm -f $(OUTPUT)
