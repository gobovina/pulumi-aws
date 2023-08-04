// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lambda

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// See https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html
type Runtime string

const (
	// Deprecated: This runtime is now deprecated
	RuntimeDotnetCore2d1 = Runtime("dotnetcore2.1")
	RuntimeDotnetCore3d1 = Runtime("dotnetcore3.1")
	RuntimeDotnet5d0     = Runtime("dotnet5.0")
	RuntimeDotnet6       = Runtime("dotnet6")
	RuntimeGo1dx         = Runtime("go1.x")
	RuntimeJava8         = Runtime("java8")
	RuntimeJava8AL2      = Runtime("java8.al2")
	RuntimeJava11        = Runtime("java11")
	// Deprecated: This runtime is now deprecated
	RuntimeRuby2d5 = Runtime("ruby2.5")
	RuntimeRuby2d7 = Runtime("ruby2.7")
	RuntimeRuby3d2 = Runtime("ruby3.2")
	// Deprecated: This runtime is now deprecated
	RuntimeNodeJS10dX = Runtime("nodejs10.x")
	RuntimeNodeJS12dX = Runtime("nodejs12.x")
	RuntimeNodeJS14dX = Runtime("nodejs14.x")
	RuntimeNodeJS16dX = Runtime("nodejs16.x")
	RuntimeNodeJS18dX = Runtime("nodejs18.x")
	// Deprecated: This runtime is now deprecated
	RuntimePython2d7 = Runtime("python2.7")
	// Deprecated: This runtime is now deprecated
	RuntimePython3d6  = Runtime("python3.6")
	RuntimePython3d7  = Runtime("python3.7")
	RuntimePython3d8  = Runtime("python3.8")
	RuntimePython3d9  = Runtime("python3.9")
	RuntimePython3d10 = Runtime("python3.10")
	RuntimePython3d11 = Runtime("python3.11")
	RuntimeCustom     = Runtime("provided")
	RuntimeCustomAL2  = Runtime("provided.al2")
)

func (Runtime) ElementType() reflect.Type {
	return reflect.TypeOf((*Runtime)(nil)).Elem()
}

func (e Runtime) ToRuntimeOutput() RuntimeOutput {
	return pulumi.ToOutput(e).(RuntimeOutput)
}

func (e Runtime) ToRuntimeOutputWithContext(ctx context.Context) RuntimeOutput {
	return pulumi.ToOutputWithContext(ctx, e).(RuntimeOutput)
}

func (e Runtime) ToRuntimePtrOutput() RuntimePtrOutput {
	return e.ToRuntimePtrOutputWithContext(context.Background())
}

func (e Runtime) ToRuntimePtrOutputWithContext(ctx context.Context) RuntimePtrOutput {
	return Runtime(e).ToRuntimeOutputWithContext(ctx).ToRuntimePtrOutputWithContext(ctx)
}

func (e Runtime) ToStringOutput() pulumi.StringOutput {
	return pulumi.ToOutput(pulumi.String(e)).(pulumi.StringOutput)
}

func (e Runtime) ToStringOutputWithContext(ctx context.Context) pulumi.StringOutput {
	return pulumi.ToOutputWithContext(ctx, pulumi.String(e)).(pulumi.StringOutput)
}

func (e Runtime) ToStringPtrOutput() pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringPtrOutputWithContext(context.Background())
}

func (e Runtime) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringOutputWithContext(ctx).ToStringPtrOutputWithContext(ctx)
}

type RuntimeOutput struct{ *pulumi.OutputState }

func (RuntimeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Runtime)(nil)).Elem()
}

func (o RuntimeOutput) ToRuntimeOutput() RuntimeOutput {
	return o
}

func (o RuntimeOutput) ToRuntimeOutputWithContext(ctx context.Context) RuntimeOutput {
	return o
}

func (o RuntimeOutput) ToRuntimePtrOutput() RuntimePtrOutput {
	return o.ToRuntimePtrOutputWithContext(context.Background())
}

func (o RuntimeOutput) ToRuntimePtrOutputWithContext(ctx context.Context) RuntimePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Runtime) *Runtime {
		return &v
	}).(RuntimePtrOutput)
}

func (o RuntimeOutput) ToStringOutput() pulumi.StringOutput {
	return o.ToStringOutputWithContext(context.Background())
}

func (o RuntimeOutput) ToStringOutputWithContext(ctx context.Context) pulumi.StringOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, e Runtime) string {
		return string(e)
	}).(pulumi.StringOutput)
}

func (o RuntimeOutput) ToStringPtrOutput() pulumi.StringPtrOutput {
	return o.ToStringPtrOutputWithContext(context.Background())
}

func (o RuntimeOutput) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, e Runtime) *string {
		v := string(e)
		return &v
	}).(pulumi.StringPtrOutput)
}

type RuntimePtrOutput struct{ *pulumi.OutputState }

func (RuntimePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Runtime)(nil)).Elem()
}

func (o RuntimePtrOutput) ToRuntimePtrOutput() RuntimePtrOutput {
	return o
}

func (o RuntimePtrOutput) ToRuntimePtrOutputWithContext(ctx context.Context) RuntimePtrOutput {
	return o
}

func (o RuntimePtrOutput) Elem() RuntimeOutput {
	return o.ApplyT(func(v *Runtime) Runtime {
		if v != nil {
			return *v
		}
		var ret Runtime
		return ret
	}).(RuntimeOutput)
}

func (o RuntimePtrOutput) ToStringPtrOutput() pulumi.StringPtrOutput {
	return o.ToStringPtrOutputWithContext(context.Background())
}

func (o RuntimePtrOutput) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, e *Runtime) *string {
		if e == nil {
			return nil
		}
		v := string(*e)
		return &v
	}).(pulumi.StringPtrOutput)
}

// RuntimeInput is an input type that accepts RuntimeArgs and RuntimeOutput values.
// You can construct a concrete instance of `RuntimeInput` via:
//
//	RuntimeArgs{...}
type RuntimeInput interface {
	pulumi.Input

	ToRuntimeOutput() RuntimeOutput
	ToRuntimeOutputWithContext(context.Context) RuntimeOutput
}

var runtimePtrType = reflect.TypeOf((**Runtime)(nil)).Elem()

type RuntimePtrInput interface {
	pulumi.Input

	ToRuntimePtrOutput() RuntimePtrOutput
	ToRuntimePtrOutputWithContext(context.Context) RuntimePtrOutput
}

type runtimePtr string

func RuntimePtr(v string) RuntimePtrInput {
	return (*runtimePtr)(&v)
}

func (*runtimePtr) ElementType() reflect.Type {
	return runtimePtrType
}

func (in *runtimePtr) ToRuntimePtrOutput() RuntimePtrOutput {
	return pulumi.ToOutput(in).(RuntimePtrOutput)
}

func (in *runtimePtr) ToRuntimePtrOutputWithContext(ctx context.Context) RuntimePtrOutput {
	return pulumi.ToOutputWithContext(ctx, in).(RuntimePtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuntimeInput)(nil)).Elem(), Runtime("dotnetcore2.1"))
	pulumi.RegisterInputType(reflect.TypeOf((*RuntimePtrInput)(nil)).Elem(), Runtime("dotnetcore2.1"))
	pulumi.RegisterOutputType(RuntimeOutput{})
	pulumi.RegisterOutputType(RuntimePtrOutput{})
}
