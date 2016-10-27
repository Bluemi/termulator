start: compile run
run:
	@gradle -q run
getlog:
	@echo TODO
	@#if [ -f log ]; then cat log | less -R; else echo "no log file"; fi
gdb:
	@echo TODO
	@#@if [ -f core ]; then gdb ./bam/build/debug/arrows core; else echo no core; fi
line-counter:
	@line-counter java
compile:
	@gradle -q build
.PHONY: run getlog gdb line-counter compile start
