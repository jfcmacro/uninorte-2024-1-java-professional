# .SUFFIXES: .dia .png

# .dia.png:
# 	dia --export=$@ $<

.phony: clean

OUTPUT=TicTacToe.png

all: $(OUTPUT)

TicTacToe.png: TicTacToe.dia
	dia --export=$@ $<
}
clean:
	rm -f $(OUTPUT)
