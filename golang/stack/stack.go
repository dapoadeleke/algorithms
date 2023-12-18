package stack

import "errors"

type Stack interface {
	Push(data any)
	Pop() (any, error)
	Peek() (any, error)
}

type MyStack struct {
	store []any
}

func (o *MyStack) Push(data any) {
	o.store = append(o.store, data)
}

func (o *MyStack) Pop() (any, error) {
	value, err := o.Peek()
	if err != nil {
		return nil, err
	}
	o.store = o.store[:len(o.store)-1]
	return value, nil
}

func (o *MyStack) Peek() (any, error) {
	if len(o.store) == 0 {
		return nil, errors.New("stack is empty")
	}
	return o.store[len(o.store)-1], nil
}
