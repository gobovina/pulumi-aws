# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['ProvisionedConcurrencyConfigArgs', 'ProvisionedConcurrencyConfig']

@pulumi.input_type
class ProvisionedConcurrencyConfigArgs:
    def __init__(__self__, *,
                 function_name: pulumi.Input[str],
                 provisioned_concurrent_executions: pulumi.Input[int],
                 qualifier: pulumi.Input[str],
                 skip_destroy: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ProvisionedConcurrencyConfig resource.
        :param pulumi.Input[str] function_name: Name or Amazon Resource Name (ARN) of the Lambda Function.
        :param pulumi.Input[int] provisioned_concurrent_executions: Amount of capacity to allocate. Must be greater than or equal to `1`.
        :param pulumi.Input[str] qualifier: Lambda Function version or Lambda Alias name.
               
               The following arguments are optional:
        :param pulumi.Input[bool] skip_destroy: Whether to retain the provisoned concurrency configuration upon destruction. Defaults to `false`. If set to `true`, the resource in simply removed from state instead.
        """
        pulumi.set(__self__, "function_name", function_name)
        pulumi.set(__self__, "provisioned_concurrent_executions", provisioned_concurrent_executions)
        pulumi.set(__self__, "qualifier", qualifier)
        if skip_destroy is not None:
            pulumi.set(__self__, "skip_destroy", skip_destroy)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Input[str]:
        """
        Name or Amazon Resource Name (ARN) of the Lambda Function.
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="provisionedConcurrentExecutions")
    def provisioned_concurrent_executions(self) -> pulumi.Input[int]:
        """
        Amount of capacity to allocate. Must be greater than or equal to `1`.
        """
        return pulumi.get(self, "provisioned_concurrent_executions")

    @provisioned_concurrent_executions.setter
    def provisioned_concurrent_executions(self, value: pulumi.Input[int]):
        pulumi.set(self, "provisioned_concurrent_executions", value)

    @property
    @pulumi.getter
    def qualifier(self) -> pulumi.Input[str]:
        """
        Lambda Function version or Lambda Alias name.

        The following arguments are optional:
        """
        return pulumi.get(self, "qualifier")

    @qualifier.setter
    def qualifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "qualifier", value)

    @property
    @pulumi.getter(name="skipDestroy")
    def skip_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to retain the provisoned concurrency configuration upon destruction. Defaults to `false`. If set to `true`, the resource in simply removed from state instead.
        """
        return pulumi.get(self, "skip_destroy")

    @skip_destroy.setter
    def skip_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_destroy", value)


@pulumi.input_type
class _ProvisionedConcurrencyConfigState:
    def __init__(__self__, *,
                 function_name: Optional[pulumi.Input[str]] = None,
                 provisioned_concurrent_executions: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 skip_destroy: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering ProvisionedConcurrencyConfig resources.
        :param pulumi.Input[str] function_name: Name or Amazon Resource Name (ARN) of the Lambda Function.
        :param pulumi.Input[int] provisioned_concurrent_executions: Amount of capacity to allocate. Must be greater than or equal to `1`.
        :param pulumi.Input[str] qualifier: Lambda Function version or Lambda Alias name.
               
               The following arguments are optional:
        :param pulumi.Input[bool] skip_destroy: Whether to retain the provisoned concurrency configuration upon destruction. Defaults to `false`. If set to `true`, the resource in simply removed from state instead.
        """
        if function_name is not None:
            pulumi.set(__self__, "function_name", function_name)
        if provisioned_concurrent_executions is not None:
            pulumi.set(__self__, "provisioned_concurrent_executions", provisioned_concurrent_executions)
        if qualifier is not None:
            pulumi.set(__self__, "qualifier", qualifier)
        if skip_destroy is not None:
            pulumi.set(__self__, "skip_destroy", skip_destroy)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name or Amazon Resource Name (ARN) of the Lambda Function.
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="provisionedConcurrentExecutions")
    def provisioned_concurrent_executions(self) -> Optional[pulumi.Input[int]]:
        """
        Amount of capacity to allocate. Must be greater than or equal to `1`.
        """
        return pulumi.get(self, "provisioned_concurrent_executions")

    @provisioned_concurrent_executions.setter
    def provisioned_concurrent_executions(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "provisioned_concurrent_executions", value)

    @property
    @pulumi.getter
    def qualifier(self) -> Optional[pulumi.Input[str]]:
        """
        Lambda Function version or Lambda Alias name.

        The following arguments are optional:
        """
        return pulumi.get(self, "qualifier")

    @qualifier.setter
    def qualifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "qualifier", value)

    @property
    @pulumi.getter(name="skipDestroy")
    def skip_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to retain the provisoned concurrency configuration upon destruction. Defaults to `false`. If set to `true`, the resource in simply removed from state instead.
        """
        return pulumi.get(self, "skip_destroy")

    @skip_destroy.setter
    def skip_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_destroy", value)


class ProvisionedConcurrencyConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 provisioned_concurrent_executions: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 skip_destroy: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Manages a Lambda Provisioned Concurrency Configuration.

        > **NOTE:** Setting `skip_destroy` to `true` means that the AWS Provider will _not_ destroy a provisioned concurrency configuration, even when running `pulumi destroy`. The configuration is thus an intentional dangling resource that is _not_ managed by Pulumi and may incur extra expense in your AWS account.

        ## Example Usage

        ### Alias Name

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.ProvisionedConcurrencyConfig("example",
            function_name=example_aws_lambda_alias["functionName"],
            provisioned_concurrent_executions=1,
            qualifier=example_aws_lambda_alias["name"])
        ```

        ### Function Version

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.ProvisionedConcurrencyConfig("example",
            function_name=example_aws_lambda_function["functionName"],
            provisioned_concurrent_executions=1,
            qualifier=example_aws_lambda_function["version"])
        ```

        ## Import

        Using `pulumi import`, import a Lambda Provisioned Concurrency Configuration using the `function_name` and `qualifier` separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig example my_function,production
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] function_name: Name or Amazon Resource Name (ARN) of the Lambda Function.
        :param pulumi.Input[int] provisioned_concurrent_executions: Amount of capacity to allocate. Must be greater than or equal to `1`.
        :param pulumi.Input[str] qualifier: Lambda Function version or Lambda Alias name.
               
               The following arguments are optional:
        :param pulumi.Input[bool] skip_destroy: Whether to retain the provisoned concurrency configuration upon destruction. Defaults to `false`. If set to `true`, the resource in simply removed from state instead.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProvisionedConcurrencyConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Lambda Provisioned Concurrency Configuration.

        > **NOTE:** Setting `skip_destroy` to `true` means that the AWS Provider will _not_ destroy a provisioned concurrency configuration, even when running `pulumi destroy`. The configuration is thus an intentional dangling resource that is _not_ managed by Pulumi and may incur extra expense in your AWS account.

        ## Example Usage

        ### Alias Name

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.ProvisionedConcurrencyConfig("example",
            function_name=example_aws_lambda_alias["functionName"],
            provisioned_concurrent_executions=1,
            qualifier=example_aws_lambda_alias["name"])
        ```

        ### Function Version

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lambda_.ProvisionedConcurrencyConfig("example",
            function_name=example_aws_lambda_function["functionName"],
            provisioned_concurrent_executions=1,
            qualifier=example_aws_lambda_function["version"])
        ```

        ## Import

        Using `pulumi import`, import a Lambda Provisioned Concurrency Configuration using the `function_name` and `qualifier` separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig example my_function,production
        ```

        :param str resource_name: The name of the resource.
        :param ProvisionedConcurrencyConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProvisionedConcurrencyConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 provisioned_concurrent_executions: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 skip_destroy: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProvisionedConcurrencyConfigArgs.__new__(ProvisionedConcurrencyConfigArgs)

            if function_name is None and not opts.urn:
                raise TypeError("Missing required property 'function_name'")
            __props__.__dict__["function_name"] = function_name
            if provisioned_concurrent_executions is None and not opts.urn:
                raise TypeError("Missing required property 'provisioned_concurrent_executions'")
            __props__.__dict__["provisioned_concurrent_executions"] = provisioned_concurrent_executions
            if qualifier is None and not opts.urn:
                raise TypeError("Missing required property 'qualifier'")
            __props__.__dict__["qualifier"] = qualifier
            __props__.__dict__["skip_destroy"] = skip_destroy
        super(ProvisionedConcurrencyConfig, __self__).__init__(
            'aws:lambda/provisionedConcurrencyConfig:ProvisionedConcurrencyConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            function_name: Optional[pulumi.Input[str]] = None,
            provisioned_concurrent_executions: Optional[pulumi.Input[int]] = None,
            qualifier: Optional[pulumi.Input[str]] = None,
            skip_destroy: Optional[pulumi.Input[bool]] = None) -> 'ProvisionedConcurrencyConfig':
        """
        Get an existing ProvisionedConcurrencyConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] function_name: Name or Amazon Resource Name (ARN) of the Lambda Function.
        :param pulumi.Input[int] provisioned_concurrent_executions: Amount of capacity to allocate. Must be greater than or equal to `1`.
        :param pulumi.Input[str] qualifier: Lambda Function version or Lambda Alias name.
               
               The following arguments are optional:
        :param pulumi.Input[bool] skip_destroy: Whether to retain the provisoned concurrency configuration upon destruction. Defaults to `false`. If set to `true`, the resource in simply removed from state instead.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProvisionedConcurrencyConfigState.__new__(_ProvisionedConcurrencyConfigState)

        __props__.__dict__["function_name"] = function_name
        __props__.__dict__["provisioned_concurrent_executions"] = provisioned_concurrent_executions
        __props__.__dict__["qualifier"] = qualifier
        __props__.__dict__["skip_destroy"] = skip_destroy
        return ProvisionedConcurrencyConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Output[str]:
        """
        Name or Amazon Resource Name (ARN) of the Lambda Function.
        """
        return pulumi.get(self, "function_name")

    @property
    @pulumi.getter(name="provisionedConcurrentExecutions")
    def provisioned_concurrent_executions(self) -> pulumi.Output[int]:
        """
        Amount of capacity to allocate. Must be greater than or equal to `1`.
        """
        return pulumi.get(self, "provisioned_concurrent_executions")

    @property
    @pulumi.getter
    def qualifier(self) -> pulumi.Output[str]:
        """
        Lambda Function version or Lambda Alias name.

        The following arguments are optional:
        """
        return pulumi.get(self, "qualifier")

    @property
    @pulumi.getter(name="skipDestroy")
    def skip_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to retain the provisoned concurrency configuration upon destruction. Defaults to `false`. If set to `true`, the resource in simply removed from state instead.
        """
        return pulumi.get(self, "skip_destroy")

