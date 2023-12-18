package stack

import (
	"reflect"
	"testing"
)

func TestMyStack_Push(t *testing.T) {
	// given
	stack := MyStack{}
	input := 5

	// when
	stack.Push(input)

	// then
	size := len(stack.store)
	if size == 0 {
		t.Errorf("Push() want data length %d, got %d", 1, size)
	}
	data := stack.store[0]
	if data != input {
		t.Errorf("Push() want data %d, got %d", input, data)
	}
}

func TestMyStack_Pop(t *testing.T) {
	type fields struct {
		store        []any
		updatedStore []any
	}
	tests := []struct {
		name    string
		fields  fields
		want    any
		wantErr bool
	}{
		{
			name: "should return error if stack is empty",
			fields: fields{
				store:        []any{},
				updatedStore: []any{},
			},
			want:    nil,
			wantErr: true,
		}, {
			name: "should return popped value",
			fields: fields{
				store:        []any{"one", "two", "three"},
				updatedStore: []any{"one", "two"},
			},
			want:    "three",
			wantErr: false,
		},
	}
	for _, tt := range tests {
		stack := MyStack{
			store: tt.fields.store,
		}
		got, err := stack.Pop()
		if err != nil && !tt.wantErr {
			t.Errorf("Pop() err = %v, wantErr %v", err, tt.wantErr)
		}
		if !reflect.DeepEqual(got, tt.want) {
			t.Errorf("Pop() got = %v, wants %v", got, tt.want)
		}
		if !reflect.DeepEqual(stack.store, tt.fields.updatedStore) {
			t.Errorf("Pop() updatedStore = %v, wants %v", stack.store, tt.fields.updatedStore)
		}

	}

}

func TestMyStack_Peek(t *testing.T) {
	type fields struct {
		store []any
	}
	tests := []struct {
		name    string
		fields  fields
		want    any
		wantErr bool
	}{
		{
			name: "should return error when stack is empty",
			fields: fields{
				store: []any{},
			},
			want:    nil,
			wantErr: true,
		}, {
			name: "should return correct value",
			fields: fields{
				store: []any{"dapo", "solomon", "peter"},
			},
			want:    "peter",
			wantErr: false,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			stack := MyStack{
				store: tt.fields.store,
			}
			got, err := stack.Peek()
			if err != nil && !tt.wantErr {
				t.Errorf("Pop() err = %v, wantErr %v", got, tt.wantErr)
			}
			if got != tt.want {
				t.Errorf("Pop got = %v, want %v", got, tt.want)
			}

		})
	}
}
