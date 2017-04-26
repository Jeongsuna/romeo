#!/usr/bin/python
import os, shutil, traceback

romeo_root = '.'

print 'Hello, Romeo!'

# C/Cpp
def c():
  count = 0;
  print('Rake petit_c...')
  _lang = romeo_root + '/c'
  if os.path.exists(romeo_root + '/petit_c'):
    shutil.rmtree(romeo_root + '/petit_c')
  
  # copy testcasesupport and Makefile
  shutil.copytree(romeo_root + '/c/testcasesupport', romeo_root + '/petit_c/testcasesupport')
  shutil.copyfile(romeo_root + '/c/Makefile', romeo_root + '/petit_c/Makefile')

  for rule in os.listdir(_lang):
    _rule = _lang + '/' + rule
    if not (os.path.isdir(_rule) and rule.startswith('CWE')):
      continue

    # print('  ' + rule)
    for subdir in os.listdir(_rule):
      _subdir = _rule + '/' + subdir
      if not (os.path.isdir(_subdir) and subdir != 'Debug'):
        continue

      # print('    ' + subdir)
      for src in sorted(os.listdir(_subdir)):
        if src.startswith('CWE') and (src.endswith('.c') or src.endswith('.cpp')):
          _src = _subdir + '/' + src
          os.makedirs(os.path.join(romeo_root, 'petit_c', rule, subdir))
          dst = os.path.join(romeo_root, 'petit_c', rule, subdir, src)
          print('  ' + subdir + '/' + src)
          shutil.copyfile(_src, dst)
          count += 1
          break;
  print('Done. (' + str(count) + ' files)\n')

# Java
def java():
  count = 0;
  print('Rake petit_java...')
  _testcases = romeo_root + '/java/ct_java/src/testcases'
  if os.path.exists(romeo_root + '/petit_java'):
    shutil.rmtree(romeo_root + '/petit_java')

  shutil.copytree(romeo_root + '/java/ct_java/src/testcasesupport', romeo_root + '/petit_java/src/testcasesupport')
  shutil.copytree(romeo_root + '/java/ct_java/lib', romeo_root + '/petit_java/lib')
  for rule in os.listdir(_testcases):
    _rule = _testcases + '/' + rule
    if not (os.path.isdir(_rule) and rule.startswith('CWE')):
      continue

    # print('  ' + rule)
    for subdir in os.listdir(_rule):
      _subdir = _rule + '/' + subdir
      if not (os.path.isdir(_subdir)):
        continue

      # print('    ' + subdir)
      for src in sorted(os.listdir(_subdir)):
        if src.startswith('CWE') and src.endswith('.java'):
          _src = _subdir + '/' + src
          os.makedirs(os.path.join(romeo_root, 'petit_java', 'src', 'testcases', rule, subdir))
          dst = os.path.join(romeo_root, 'petit_java', 'src', 'testcases', rule, subdir, src)
          print('  ' + subdir + '/' + src)
          shutil.copyfile(_src, dst)
          count += 1
          break;
  print('Done. (' + str(count) + ' files)\n')

try:
  c()
  java()
except Exception, e:
  print('')
  traceback.print_exc(e)


