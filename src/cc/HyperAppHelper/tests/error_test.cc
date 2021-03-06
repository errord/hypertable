/**
 * Copyright (C) 2007-2012 Hypertable, Inc.
 *
 * This file is part of Hypertable.
 *
 * Hypertable is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or any later version.
 *
 * Hypertable is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */
#include "Common/Compat.h"
#include "Common/Error.h"
#include <iostream>
#include <map>
#include <cassert>
#include "HyperAppHelper/Error.h"

using namespace Hypertable;
using namespace Hypertable::HyperAppHelper;

static int argc;
static char **argv;

int 
main(int _argc, char **_argv)
{
  argv=_argv;
  argc=_argc;

  const char *s;

  s=error_get_text(Error::RANGESERVER_RANGE_BUSY);
  assert(!strcmp(s, "RANGE SERVER range busy"));
  s=error_get_text(Error::UNPOSSIBLE);
  assert(!strcmp(s, "But that's unpossible!"));
  s=error_get_text(Error::EXTERNAL);
  assert(!strcmp(s, "External error"));
  s=error_get_text(999999);
  assert(!strcmp(s, "ERROR NOT REGISTERED"));

  return (0);
}
