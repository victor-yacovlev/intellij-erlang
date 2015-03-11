/*
 * Copyright 2012-2013 Sergey Ignatov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.erlang.lexer;

import com.intellij.psi.tree.IElementType;
import org.intellij.erlang.psi.ErlangTokenType;

public interface ErlangInterimTokenTypes {
  IElementType ANY = new ErlangTokenType("any");
  IElementType FORM = new ErlangTokenType("form");
  IElementType ERL_MACRO_BODY_BEGIN = new ErlangTokenType("macro_body_begin");
  IElementType ERL_MACRO_BODY_END = new ErlangTokenType("macro_body_end");
}