package de.jotomo.ruffyscripter.commands;

public class CommandResult {
    public boolean success;
    public boolean enacted;
    public Exception exception;
    public String message;

    public CommandResult() {
    }

    public CommandResult success(boolean success) {
        this.success = success;
        return this;
    }

    public CommandResult enacted(boolean enacted) {
        this.enacted = enacted;
        return this;
    }

    public CommandResult exception(Exception exception) {
        this.exception = exception;
        return this;
    }

    public CommandResult message(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "CommandResult{" +
                "success=" + success +
                ", enacted=" + enacted +
                ", exception=" + exception +
                ", message='" + message + '\'' +
                '}';
    }
}
