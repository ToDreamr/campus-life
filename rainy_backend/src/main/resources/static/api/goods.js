// 查询列表接口
const getGoodsPage = (params) => {
  return $axios({
    url: '/shop/goods/page',
    method: 'get',
    params
  })
}

// 删除接口
const deleteGoods = (ids) => {
  return $axios({
    url: '/shop/goods',
    method: 'delete',
    params: { ids }
  })
}

// 修改接口
const editGoods = (params) => {
  return $axios({
    url: '/shop/goods',
    method: 'put',
    data: { ...params }
  })
}

// 新增接口
const addGoods= (params) => {
  return $axios({
    url: '/shop/goods',
    method: 'post',
    data: { ...params }
  })
}

// 查询详情
const queryGoodsById = (id) => {
  return $axios({
    url: `/shop/goods/${id}`,
    method: 'get'
  })
}

// 获取菜品分类列表
const getClassifyList = (params) => {
  return $axios({
    url: '/shop/classify/list',
    method: 'get',
    params
  })
}

// 查菜品列表的接口
const queryDishList = (params) => {
  return $axios({
    url: '/shop/goods/list',
    method: 'get',
    params
  })
}

// 文件down预览
const commonDownload = (params) => {
  return $axios({
    headers: {
      'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
    },
    url: '/common/download',
    method: 'get',
    params
  })
}

// 起售停售---批量起售停售接口
const dishStatusByStatus = (params) => {
  return $axios({
    url: `/shop/goods/status/${params.id}`,
    method: 'post',
    params: { id: params.id }
  })
}


function Query(params) {
  return $axios({
    url: `/shop/goods/key`,
    method: 'get',
    params
  })
}