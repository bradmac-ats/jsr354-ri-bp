/*
 * Copyright (c) 2012, 2014, Credit Suisse (Anatole Tresch), Werner Keil and others by the @author tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.javamoney.moneta.spi.format;

import java.io.IOException;

import javax.money.MonetaryAmount;
import javax.money.format.MonetaryParseException;

/**
 * Abstraction for a token that is part of a token stream, used for formatting
 * and parsing.
 * 
 * @author Anatole Tresch
 */
public interface FormatToken {
	/**
	 * Parse the context, based on the given {@link ParseContext}.
	 * 
	 * @param context
	 *            the current {@link ParseContext}.
	 * @throws MonetaryParseException
	 *             if parsing fails.
	 */
    void parse(ParseContext context) throws MonetaryParseException;

	/**
	 * Formats the given {@link javax.money.MonetaryAmount} to an {@link Appendable}.
	 * @param appendable the {@link Appendable}, not {@code null}.
	 * @param amount the {@link MonetaryAmount} to be formatted, not {@code null}.
	 * @throws IOException thrown by the {@link Appendable} on appending.
	 */
    void print(Appendable appendable, MonetaryAmount amount)
			throws IOException;

}
