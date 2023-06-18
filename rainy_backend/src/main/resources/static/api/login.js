function loginApi(data) {
  return $axios({
    'url': '/auth/login',
    'method': 'post',
    data
  })
}

function logoutApi(){
  return $axios({
    'url': '/auth/logout',
    'method': 'post',
  })
}
