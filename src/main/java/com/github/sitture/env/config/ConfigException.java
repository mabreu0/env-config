package com.github.sitture.env.config;

public class ConfigException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new runtime exception.
	 * @param error
	 *            a {@link java.lang.Throwable} object.
	 */
	public ConfigException(final Throwable error) {
		super(error);
	}

	/**
	 * Constructs a new runtime exception.
	 * @param message
	 *            a {@link java.lang.String} object.
	 * @param error
	 *            a {@link java.lang.Throwable} object.
	 */
	public ConfigException(final String message, final Throwable error) {
		super(message, error);
	}

	/**
	 * Constructs a new runtime exception.
	 * @param message
	 *            a {@link java.lang.String} object.
	 */
	public ConfigException(final String message) {
		super(message);
	}

}
