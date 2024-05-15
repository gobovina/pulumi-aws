# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AwsLogSourceArgs', 'AwsLogSource']

@pulumi.input_type
class AwsLogSourceArgs:
    def __init__(__self__, *,
                 source: Optional[pulumi.Input['AwsLogSourceSourceArgs']] = None):
        """
        The set of arguments for constructing a AwsLogSource resource.
        :param pulumi.Input['AwsLogSourceSourceArgs'] source: Specify the natively-supported AWS service to add as a source in Security Lake.
        """
        if source is not None:
            pulumi.set(__self__, "source", source)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['AwsLogSourceSourceArgs']]:
        """
        Specify the natively-supported AWS service to add as a source in Security Lake.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['AwsLogSourceSourceArgs']]):
        pulumi.set(self, "source", value)


@pulumi.input_type
class _AwsLogSourceState:
    def __init__(__self__, *,
                 source: Optional[pulumi.Input['AwsLogSourceSourceArgs']] = None):
        """
        Input properties used for looking up and filtering AwsLogSource resources.
        :param pulumi.Input['AwsLogSourceSourceArgs'] source: Specify the natively-supported AWS service to add as a source in Security Lake.
        """
        if source is not None:
            pulumi.set(__self__, "source", source)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['AwsLogSourceSourceArgs']]:
        """
        Specify the natively-supported AWS service to add as a source in Security Lake.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['AwsLogSourceSourceArgs']]):
        pulumi.set(self, "source", value)


class AwsLogSource(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['AwsLogSourceSourceArgs']]] = None,
                 __props__=None):
        """
        Resource for managing an Amazon Security Lake AWS Log Source.

        > **NOTE:** A single `securitylake.AwsLogSource` should be used to configure a log source across all regions and accounts.

        > **NOTE:** The underlying `securitylake.DataLake` must be configured before creating the `securitylake.AwsLogSource`. Use a `depends_on` statement.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securitylake.AwsLogSource("example", source=aws.securitylake.AwsLogSourceSourceArgs(
            accounts=["123456789012"],
            regions=["eu-west-1"],
            source_name="ROUTE53",
        ),
        opts=pulumi.ResourceOptions(depends_on=[example_aws_securitylake_data_lake]))
        ```

        ## Import

        Using `pulumi import`, import AWS log sources using the source name. For example:

        ```sh
        $ pulumi import aws:securitylake/awsLogSource:AwsLogSource example ROUTE53
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AwsLogSourceSourceArgs']] source: Specify the natively-supported AWS service to add as a source in Security Lake.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AwsLogSourceArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an Amazon Security Lake AWS Log Source.

        > **NOTE:** A single `securitylake.AwsLogSource` should be used to configure a log source across all regions and accounts.

        > **NOTE:** The underlying `securitylake.DataLake` must be configured before creating the `securitylake.AwsLogSource`. Use a `depends_on` statement.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securitylake.AwsLogSource("example", source=aws.securitylake.AwsLogSourceSourceArgs(
            accounts=["123456789012"],
            regions=["eu-west-1"],
            source_name="ROUTE53",
        ),
        opts=pulumi.ResourceOptions(depends_on=[example_aws_securitylake_data_lake]))
        ```

        ## Import

        Using `pulumi import`, import AWS log sources using the source name. For example:

        ```sh
        $ pulumi import aws:securitylake/awsLogSource:AwsLogSource example ROUTE53
        ```

        :param str resource_name: The name of the resource.
        :param AwsLogSourceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AwsLogSourceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['AwsLogSourceSourceArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AwsLogSourceArgs.__new__(AwsLogSourceArgs)

            __props__.__dict__["source"] = source
        super(AwsLogSource, __self__).__init__(
            'aws:securitylake/awsLogSource:AwsLogSource',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            source: Optional[pulumi.Input[pulumi.InputType['AwsLogSourceSourceArgs']]] = None) -> 'AwsLogSource':
        """
        Get an existing AwsLogSource resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AwsLogSourceSourceArgs']] source: Specify the natively-supported AWS service to add as a source in Security Lake.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AwsLogSourceState.__new__(_AwsLogSourceState)

        __props__.__dict__["source"] = source
        return AwsLogSource(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional['outputs.AwsLogSourceSource']]:
        """
        Specify the natively-supported AWS service to add as a source in Security Lake.
        """
        return pulumi.get(self, "source")

