model = crnn.CRNN(32, 1, len(alphabet)+1, 256)
if torch.cuda.is_available():
    model = model.cuda()
print('loading pretrained model from %s' % model_path)
model.load_state_dict(torch.load(model_path))
print(model)
