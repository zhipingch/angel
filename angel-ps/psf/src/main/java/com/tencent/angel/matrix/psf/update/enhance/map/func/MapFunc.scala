/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */


package com.tencent.angel.matrix.psf.update.enhance.map.func

import com.tencent.angel.common.Serialize
import com.tencent.angel.matrix.psf.update.enhance.map.Map
import com.tencent.angel.ml.math2.ufuncs.expression.Unary


/**
  * `MapFunc` is a parameter of [[Map]], if you want to
  * call a `Map` for a row in matrix, you implement a `MapFunc` as parameter of `Map`
  */
trait MapFunc extends Unary with Serialize