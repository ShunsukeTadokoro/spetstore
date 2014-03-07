package com.github.j5ik2o.spetstore.domain.model.item

import com.github.j5ik2o.spetstore.domain.infrastructure.support.Entity

/**
 * 商品の種類を表すエンティティ。
 * 
 * @param id 識別子
 * @param categoryId [[com.github.j5ik2o.spetstore.domain.model.item.CategoryId]]
 * @param name 名前
 * @param description 説明
 */
case class ItemType
(id: ItemTypeId = ItemTypeId(),
 categoryId: CategoryId,
 name: String,
 description: Option[String] = None)
  extends Entity[ItemTypeId]
