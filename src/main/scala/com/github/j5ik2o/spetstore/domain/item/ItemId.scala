package com.github.j5ik2o.spetstore.domain.item

import com.github.j5ik2o.spetstore.infrastructure.support.Identifier
import java.util.UUID

/**
 * [[com.github.j5ik2o.spetstore.domain.item.Item]]のための識別子
 *
 * @param value 識別子の値
 */
case class ItemId(value: UUID = UUID.randomUUID())
  extends Identifier[UUID]