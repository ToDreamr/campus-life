// 查询列表数据
const getSetmealPage = (params) => {
  return $axios({
    url: '/shop/appeal/page',
    method: 'get',
    params
  })
}

// 删除数据接口
const deleteSetmeal = (id) => {
  return $axios({
    //请求路径变量时，axios的写法如下
    url: `/shop/appeal/${id}`,
    method: 'delete',
    params: { id }
  })
}

// 修改数据接口
const editSetmeal = (params) => {
  return $axios({
    url: '/boss',
    method: 'put',
    data: { ...params }
  })
}

// 新增数据接口
const addSetmeal = (params) => {
  return $axios({
    url: '/boss',
    method: 'post',
    data: { ...params }
  })
}

// 查询详情接口
const querySetmealById = (id) => {
  return $axios({
    url: `/boss/${id}`,
    method: 'get'
  })
}

// 批量起售禁售
const setmealStatusByStatus = (params) => {
  return $axios({
    url: `/shop/appeal/status/${params.id}`,
    method: 'post',
    params: { id: params.id }
  })
}
