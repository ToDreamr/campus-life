// 查询列表接口
const getCategoryPage = (params) => {
  return $axios({
    url: '/shop/classify/page',
    method: 'get',
    params
  })
}

// 编辑页面反查详情接口
const queryClassifyById = (id) => {
  return $axios({
    url: `/shop/classify/${id}`,
    method: 'get'
  })
}

// 删除当前列的接口
const deleClassify = (id) => {
  return $axios({
    url: '/shop/classify',
    method: 'delete',
    params: { id }
  })
}

// 修改接口
const editCategory = (params) => {
  return $axios({
    url: '/shop/classify',
    method: 'put',
    data: { ...params }
  })
}

// 新增接口
const addClassify = (params) => {
  return $axios({
    url: '/shop/classify',
    method: 'post',
    data: { ...params }
  })
}