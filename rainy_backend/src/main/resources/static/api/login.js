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

function changeBack(data){
  let name=4
  return $axios({
    'url':'/common/download',
    method:'post',
    data: {
      name
    }
  })
}