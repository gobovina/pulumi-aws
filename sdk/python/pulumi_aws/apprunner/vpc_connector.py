# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VpcConnectorArgs', 'VpcConnector']

@pulumi.input_type
class VpcConnectorArgs:
    def __init__(__self__, *,
                 security_groups: pulumi.Input[Sequence[pulumi.Input[str]]],
                 subnets: pulumi.Input[Sequence[pulumi.Input[str]]],
                 vpc_connector_name: pulumi.Input[str],
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a VpcConnector resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnets: A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
        :param pulumi.Input[str] vpc_connector_name: A name for the VPC connector.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "security_groups", security_groups)
        pulumi.set(__self__, "subnets", subnets)
        pulumi.set(__self__, "vpc_connector_name", vpc_connector_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
        """
        return pulumi.get(self, "security_groups")

    @security_groups.setter
    def security_groups(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "security_groups", value)

    @property
    @pulumi.getter
    def subnets(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
        """
        return pulumi.get(self, "subnets")

    @subnets.setter
    def subnets(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "subnets", value)

    @property
    @pulumi.getter(name="vpcConnectorName")
    def vpc_connector_name(self) -> pulumi.Input[str]:
        """
        A name for the VPC connector.
        """
        return pulumi.get(self, "vpc_connector_name")

    @vpc_connector_name.setter
    def vpc_connector_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_connector_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _VpcConnectorState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_connector_name: Optional[pulumi.Input[str]] = None,
                 vpc_connector_revision: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering VpcConnector resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
        :param pulumi.Input[str] status: The current state of the VPC connector. If the status of a connector revision is INACTIVE, it was deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnets: A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] vpc_connector_name: A name for the VPC connector.
        :param pulumi.Input[int] vpc_connector_revision: The revision of VPC connector. It's unique among all the active connectors ("Status": "ACTIVE") that share the same Name.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if security_groups is not None:
            pulumi.set(__self__, "security_groups", security_groups)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if subnets is not None:
            pulumi.set(__self__, "subnets", subnets)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_connector_name is not None:
            pulumi.set(__self__, "vpc_connector_name", vpc_connector_name)
        if vpc_connector_revision is not None:
            pulumi.set(__self__, "vpc_connector_revision", vpc_connector_revision)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
        """
        return pulumi.get(self, "security_groups")

    @security_groups.setter
    def security_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_groups", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The current state of the VPC connector. If the status of a connector revision is INACTIVE, it was deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def subnets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
        """
        return pulumi.get(self, "subnets")

    @subnets.setter
    def subnets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnets", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcConnectorName")
    def vpc_connector_name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the VPC connector.
        """
        return pulumi.get(self, "vpc_connector_name")

    @vpc_connector_name.setter
    def vpc_connector_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_connector_name", value)

    @property
    @pulumi.getter(name="vpcConnectorRevision")
    def vpc_connector_revision(self) -> Optional[pulumi.Input[int]]:
        """
        The revision of VPC connector. It's unique among all the active connectors ("Status": "ACTIVE") that share the same Name.
        """
        return pulumi.get(self, "vpc_connector_revision")

    @vpc_connector_revision.setter
    def vpc_connector_revision(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vpc_connector_revision", value)


class VpcConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_connector_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an App Runner VPC Connector.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        connector = aws.apprunner.VpcConnector("connector",
            security_groups=[
                "sg1",
                "sg2",
            ],
            subnets=[
                "subnet1",
                "subnet2",
            ],
            vpc_connector_name="name")
        ```

        ## Import

        App Runner vpc connector can be imported by using the `vpc_connector_name`, e.g.,

        ```sh
         $ pulumi import aws:apprunner/vpcConnector:VpcConnector vpc_connector_name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnets: A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] vpc_connector_name: A name for the VPC connector.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an App Runner VPC Connector.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        connector = aws.apprunner.VpcConnector("connector",
            security_groups=[
                "sg1",
                "sg2",
            ],
            subnets=[
                "subnet1",
                "subnet2",
            ],
            vpc_connector_name="name")
        ```

        ## Import

        App Runner vpc connector can be imported by using the `vpc_connector_name`, e.g.,

        ```sh
         $ pulumi import aws:apprunner/vpcConnector:VpcConnector vpc_connector_name
        ```

        :param str resource_name: The name of the resource.
        :param VpcConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_connector_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcConnectorArgs.__new__(VpcConnectorArgs)

            if security_groups is None and not opts.urn:
                raise TypeError("Missing required property 'security_groups'")
            __props__.__dict__["security_groups"] = security_groups
            if subnets is None and not opts.urn:
                raise TypeError("Missing required property 'subnets'")
            __props__.__dict__["subnets"] = subnets
            __props__.__dict__["tags"] = tags
            if vpc_connector_name is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_connector_name'")
            __props__.__dict__["vpc_connector_name"] = vpc_connector_name
            __props__.__dict__["arn"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["vpc_connector_revision"] = None
        super(VpcConnector, __self__).__init__(
            'aws:apprunner/vpcConnector:VpcConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_connector_name: Optional[pulumi.Input[str]] = None,
            vpc_connector_revision: Optional[pulumi.Input[int]] = None) -> 'VpcConnector':
        """
        Get an existing VpcConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
        :param pulumi.Input[str] status: The current state of the VPC connector. If the status of a connector revision is INACTIVE, it was deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnets: A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] vpc_connector_name: A name for the VPC connector.
        :param pulumi.Input[int] vpc_connector_revision: The revision of VPC connector. It's unique among all the active connectors ("Status": "ACTIVE") that share the same Name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcConnectorState.__new__(_VpcConnectorState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["security_groups"] = security_groups
        __props__.__dict__["status"] = status
        __props__.__dict__["subnets"] = subnets
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_connector_name"] = vpc_connector_name
        __props__.__dict__["vpc_connector_revision"] = vpc_connector_revision
        return VpcConnector(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The current state of the VPC connector. If the status of a connector revision is INACTIVE, it was deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def subnets(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
        """
        return pulumi.get(self, "subnets")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcConnectorName")
    def vpc_connector_name(self) -> pulumi.Output[str]:
        """
        A name for the VPC connector.
        """
        return pulumi.get(self, "vpc_connector_name")

    @property
    @pulumi.getter(name="vpcConnectorRevision")
    def vpc_connector_revision(self) -> pulumi.Output[int]:
        """
        The revision of VPC connector. It's unique among all the active connectors ("Status": "ACTIVE") that share the same Name.
        """
        return pulumi.get(self, "vpc_connector_revision")

